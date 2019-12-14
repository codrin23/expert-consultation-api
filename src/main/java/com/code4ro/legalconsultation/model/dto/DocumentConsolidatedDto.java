package com.code4ro.legalconsultation.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DocumentConsolidatedDto extends BaseEntityDto {
    private DocumentNodeDto documentNode;
    private DocumentConfigutaionDto documentConfigutaion;
}
