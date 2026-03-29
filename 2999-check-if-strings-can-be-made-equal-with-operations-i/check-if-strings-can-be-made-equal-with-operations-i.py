class Solution:
    def canBeEqual(self, s1: str, s2: str) -> bool:
        if (s1 == s2):
            return True

        else:
            l = list(s2)

            if (l[0] == s1[0]):
                l[1], l[3] = l[3], l[1]
                s3 = ''.join(l)

                if (s1 == s3):
                    return True
                
            elif (l[1] == s1[1]):
                l[0], l[2] = l[2], l[0]
                s4 = ''.join(l)

                if (s1 == s4):
                    return True
            
            else:
                l[1], l[3] = l[3], l[1]
                l[0], l[2] = l[2], l[0]
                s5 = ''.join(l)

                if (s1 == s5):
                    return True
            
            return False
