import re

def replace_unquoted(text):
    pattern = r'(\'.*?\'|\".*?\")|([oa])'
    
    def replacement(match):
        if match.group(1):
            return match.group(1)
        else:
            char = match.group(2)
            replacements = {
                'o': '%ba',
                'a': '%aa',
            }
            return replacements.get(char, char)
    
    result = re.sub(pattern, replacement, text)
    return result

input_text = '' # payload
output_text = replace_unquoted(input_text)
print("处理后的字符串:", output_text)
