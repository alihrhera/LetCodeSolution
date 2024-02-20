class Solution {

    function romanToInt(string $s): int
{
    // Validate string length
    if (strlen($s) < 1 || strlen($s) > 15) {
        throw new Exception("String length must be >=1 and <=15");
    }

    // Define Roman numeral values using an associative array
    $romanCharValues = [
        "I" => 1,
        "V" => 5,
        "X" => 10,
        "L" => 50,
        "C" => 100,
        "D" => 500,
        "M" => 1000,
        "IV" => 4,
        "IX" => 9,
        "XL" => 40,
        "XC" => 90,
        "CD" => 400,
        "CM" => 900,
    ];

    // Validate character usage
    if (!ctype_alpha($s) || preg_match('/[^IVXLCDM]/', $s)) {
        throw new Exception("We can only accept 'I', 'V', 'X', 'L', 'C', 'D', 'M'");
    }

    $getAsPair = ["IV", "IX", "XL", "XC", "CD", "CM"]; // Special pairs
    $valueOfRoman = 0;

    for ($i = 0; $i < strlen($s); $i++) {
        // Check for special pairs first
        if (isset($s[$i + 1]) && in_array($s[$i] . $s[$i + 1], $getAsPair)) {
            $valueOfRoman += $romanCharValues[$s[$i] . $s[$i + 1]];
            $i++;
        } else {
            $valueOfRoman += $romanCharValues[$s[$i]];
        }
    }

    return $valueOfRoman;
}

}