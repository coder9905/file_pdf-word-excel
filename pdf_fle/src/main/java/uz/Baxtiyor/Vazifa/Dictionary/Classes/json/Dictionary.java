package uz.Baxtiyor.Vazifa.Dictionary.Classes.json;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Dictionary {
    private String text;
    private String pos;
    private List<Tr> tr;

}