class Solution:
    def maximum69Number (self, num: int) -> int:
        if num == 9999:
            return num
        if num == 96 or num == 69:
            return 99
        if num == 996:
            return 999
        a = str(num)
        l = list(a)
        if num == 966 or num == 969:
            l[1] = '9'
            s = int(''.join(map(str,l)))
            return s
        if num >= 9666 and num <= 9699:
            l[1] = '9'
            s = int(''.join(map(str,l)))
            return s
        if num == 9966 or num == 9969:
            l[2] = '9'
            s = int(''.join(map(str,l)))
            return s
        if num == 9996:
            l[3] = '9'
            s = int(''.join(map(str,l)))
            return s
        if num <= 6999:
            l[0] = '9'
            s = int(''.join(map(str,l)))
            return s
        
            