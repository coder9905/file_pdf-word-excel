package uz.Baxtiyor.Vazifa.Dictionary.Classes.json;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Respose {
    private List<Dictionary> def;

}
