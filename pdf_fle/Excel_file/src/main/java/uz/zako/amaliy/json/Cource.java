package uz.zako.amaliy.json;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Cource {
    private Long id;
    private String Code;
    private String Ccy;
    private String CcyNm_RU;
    private String CcyNm_UZ;
    private String CcyNm_UZC;
    private String CcyNm_EN;
    private String Nominal;
    private String Rate;
    private String Diff;
    private String Date;
}
