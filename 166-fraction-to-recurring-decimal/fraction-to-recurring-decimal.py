class Solution:
    def fractionToDecimal(self, numerator: int, denominator: int) -> str:
        if numerator == 0:
            return "0"
        
        result = []
        
        # Handle negative sign
        if (numerator < 0) ^ (denominator < 0):
            result.append("-")
        
        # Convert to positive
        numerator = abs(numerator)
        denominator = abs(denominator)
        
        # Integer part
        result.append(str(numerator // denominator))
        numerator %= denominator
        
        if numerator == 0:
            return "".join(result)
        
        # Add decimal point
        result.append(".")
        
        # HashMap to store remainder -> index mapping
        remainder_map = {}
        
        while numerator != 0:
            if numerator in remainder_map:
                # Found repeating cycle
                index = remainder_map[numerator]
                result.insert(index, "(")
                result.append(")")
                break
            
            # Store current remainder and its position
            remainder_map[numerator] = len(result)
            
            numerator *= 10
            result.append(str(numerator // denominator))
            numerator %= denominator
        
        return "".join(result)
