package uz.zako.ExcelVazifa.classes;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

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
