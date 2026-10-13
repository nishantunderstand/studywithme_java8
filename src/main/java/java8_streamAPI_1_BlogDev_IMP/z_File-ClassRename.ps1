$files = @{
    "a_EvenNumber"                 = "a_1_EvenNumber"
    "b_NumberStartingWithOne"      = "b_2_NumberStartingWithOne"
    "c1_DuplicateElements"         = "c_3_1_DuplicateElements"
    "c2_DuplicateElements"         = "c_3_2_DuplicateElements"
    "d_FindFirstElement"           = "d_4_FindFirstElement"
    "d_FindFirstElementEvenNumber" = "d_5_FindFirstElementEvenNumber"
    "d_FindSecondElement"          = "d_6_FindSecondElement"
    "e_FindTheTotalNumberOfElements" = "e_7_FindTheTotalNumberOfElements"
    "f_FindMaxElement"             = "f_8_FindMaxElement"
    "g_FindNonRepeated"            = "g_9_FindNonRepeated"
    "h_FirstRepeated"              = "h_10_FirstRepeated"
    "i_SortValues"                 = "i_11_SortValues"
    "j_SortDescending"             = "j_12_SortDescending"
    "k_ContainDuplicate"           = "k_13_ContainDuplicate"
    "l_WorkWithDate"               = "l_14_WorkWithDate"
    "m_StreamAdd"                  = "m_15_StreamAdd"
    "n_PerformCube"                = "n_16_PerformCube"
    "o_SortAndConvertToStream"     = "o_17_SortAndConvertToStream"
    "p_mapToUpperCase"             = "p_18_mapToUpperCase"
    "q_ListMapRemoveDuplicateKeys" = "q_19_ListMapRemoveDuplicateKeys"
    "r_CountWordArrayList"         = "r_20_CountWordArrayList"
    "s_DuplicateElemenetCount"     = "s_21_DuplicateElemenetCount"
    "t_CheckEmptyByJava8"          = "t_22_CheckEmptyByJava8"
    "u_FindMaxInArray"             = "u_23_FindMaxInArray"
    "v_CharacterCount"             = "v_24_CharacterCount"
}

foreach ($entry in $files.GetEnumerator()) {

    $old = $entry.Key
    $new = $entry.Value

    if (Test-Path "$new.java") {
        (Get-Content "$new.java" -Raw) `
            -replace "public\s+class\s+$old", "public class $new" |
            Set-Content "$new.java"

        Write-Host "Updated class $old -> $new"
    }
}