package uz.Baxtiyor.Amaliyot_uchun.json;

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
