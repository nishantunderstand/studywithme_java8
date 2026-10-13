$files = @{
    "a_1_EvenNumber"                       = "a_1_EvenNumber"
    "b_2_NumberStartingWithOne"            = "b_2_NumberStartingWithOne"

    "c_3_1_DuplicateElements"             = "c_3_1_DuplicateElements"
    "c_3_2_DuplicateElements"             = "c_3_2_DuplicateElements"

    "d_4_FindFirstElement"                = "d_4_FindFirstElement"
    "d_5_FindFirstElementEvenNumber"      = "d_4_FindFirstElementEvenNumber"
    "d_6_FindSecondElement"               = "d_4_FindSecondElement"

    "e_7_FindTheTotalNumberOfElements"    = "e_5_FindTheTotalNumberOfElements"
    "f_8_FindMaxElement"                  = "f_6_FindMaxElement"
    "g_9_FindNonRepeated"                 = "g_7_FindNonRepeated"
    "h_10_FirstRepeated"                  = "h_8_FirstRepeated"
    "i_11_SortValues"                     = "i_9_SortValues"
    "j_12_SortDescending"                 = "j_10_SortDescending"
    "k_13_ContainDuplicate"               = "k_11_ContainDuplicate"
    "l_14_WorkWithDate"                   = "l_12_WorkWithDate"
    "m_15_StreamAdd"                      = "m_13_StreamAdd"

    "n_16_PerformCube"                    = "n_14_PerformCube"
    "o_17_SortAndConvertToStream"         = "o_15_SortAndConvertToStream"
    "p_18_mapToUpperCase"                 = "p_16_mapToUpperCase"
    "q_19_ListMapRemoveDuplicateKeys"     = "q_17_ListMapRemoveDuplicateKeys"
    "r_20_CountWordArrayList"             = "r_18_CountWordArrayList"
    "s_21_DuplicateElemenetCount"         = "s_19_DuplicateElemenetCount"
    "t_22_CheckEmptyByJava8"              = "t_20_CheckEmptyByJava8"
    "u_23_FindMaxInArray"                 = "u_21_FindMaxInArray"
    "v_24_CharacterCount"                 = "v_22_CharacterCount"
}

foreach ($entry in $files.GetEnumerator()) {

    $old = $entry.Key
    $new = $entry.Value

    $oldFile = "$old.java"
    $newFile = "$new.java"

    if ($old -ne $new -and (Test-Path $oldFile)) {

        Rename-Item $oldFile $newFile

        (Get-Content $newFile -Raw) `
            -replace "public\s+class\s+$old", "public class $new" |
            Set-Content $newFile

        Write-Host "Updated: $old.java -> $new.java"
    }
}