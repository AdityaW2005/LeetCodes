class Solution:
    def peopleAwareOfSecret(self, n: int, delay: int, forget: int) -> int:
        """
        Solves LeetCode 2327: Number of People Aware of a Secret using dynamic programming.

        :param n: The total number of days.
        :param delay: The number of days a person waits before sharing.
        :param forget: The number of days after which a person forgets the secret.
        :return: The total number of people aware of the secret on day n, modulo 10^9 + 7.
        """
        
        # MOD for the final result as per the problem statement.
        MOD = 10**9 + 7

        # dp[i] will store the number of *new* people who learn the secret on day i.
        dp = [0] * (n + 1)
        
        # Base case: On day 1, one person discovers the secret.
        dp[1] = 1
        
        # 'sharing' tracks the number of people who are currently able to share the secret.
        sharing = 0
        
        # Iterate from day 2 to day n to fill the dp array.
        for i in range(2, n + 1):
            # Add the people who start sharing today.
            # These are the people who learned the secret 'delay' days ago.
            if i - delay >= 0:
                sharing = (sharing + dp[i - delay]) % MOD
            
            # Subtract the people who forget the secret today and stop sharing.
            # These are the people who learned the secret 'forget' days ago.
            if i - forget >= 0:
                sharing = (sharing - dp[i - forget] + MOD) % MOD

            # The number of new people learning today is the number of people currently sharing.
            dp[i] = sharing

        # The total number of people who know the secret on day 'n' are those
        # who learned it in the last 'forget' days and haven't forgotten yet.
        total_aware = 0
        for i in range(n - forget + 1, n + 1):
            total_aware = (total_aware + dp[i]) % MOD
            
        return total_aware
