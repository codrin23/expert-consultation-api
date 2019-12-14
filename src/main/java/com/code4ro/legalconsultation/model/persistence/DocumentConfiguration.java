package com.code4ro.legalconsultation.model.persistence;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "document_configuration")
@Getter
@Setter
public class DocumentConfiguration extends BaseEntity {

    @Column(name = "is_open_for_commenting")
    private Boolean isOpenForCommenting;

    @Column(name = "is_open_for_voting_comments")
    private Boolean isOpenForVotingComments;

    public DocumentConfiguration() {
    }

    public DocumentConfiguration(Boolean isOpenForCommenting, Boolean isOpenForVotingComments) {
        this.isOpenForCommenting = isOpenForCommenting;
        this.isOpenForVotingComments = isOpenForVotingComments;
    }
}
