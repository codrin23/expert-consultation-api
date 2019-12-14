package com.code4ro.legalconsultation.model.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DocumentConfigutaionDto extends BaseEntityDto {
    private Boolean isOpenForCommenting;
    private Boolean isOpenForVotingComments;
}
