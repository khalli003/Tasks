class Solution {
    public int myAtoi(String s) {
        s = s.trim();  // Удаляем начальные и конечные пробелы
        if (s.isEmpty())
            return 0;
        int sign = 1;  // Знак числа (1 для положительного, -1 для отрицательного)
        int result = 0;
        int i = 0;
        if (s.charAt(i) == '-' || s.charAt(i) == '+') {  // Проверяем знак числа
            if (s.charAt(i) == '-')
                sign = -1;
            i++;
        }
        while (i < s.length() && Character.isDigit(s.charAt(i))) {  // Считываем цифры
            int digit = s.charAt(i) - '0';
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + digit;
            i++;
        }
        return result * sign;  // Применяем знак к результату
    }


}
