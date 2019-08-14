class Solution(object):
    def reverseWords(self, s):
        """
        :type s: str
        :rtype: str
        """
        words = s.split();
        str = ""
        for st in reversed(words):
            str = str + " " + st
        return str[1:]
