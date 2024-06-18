class Solution(object):
    def reversePrefix(self, word, ch):
        """
        :type word: str
        :type ch: str
        :rtype: str
        """
        c=""
        count = 0
        strin = word.find(ch)
        if(strin!=-1):
            for x in word:
                count += 1
                c=c+x
                if(x==ch):
                    # print(x)
                    break
            a = c[::-1]
            b = word[count:]
            final = a+b
            print(type(final))
            return final
            # print("Final ",a+b)
            # print("String :",c)
        
        else:
            return word


        