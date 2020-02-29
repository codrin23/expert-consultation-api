package com.code4ro.legalconsultation.service.api;

import com.code4ro.legalconsultation.model.dto.DocumentConsolidatedDto;
import com.code4ro.legalconsultation.model.dto.DocumentViewDto;
import com.code4ro.legalconsultation.model.persistence.DocumentConsolidated;
import com.code4ro.legalconsultation.model.persistence.DocumentMetadata;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public interface DocumentService {
    //return all metadata for documents
    Page<DocumentMetadata> fetchAll(Pageable pageable);

    //return document metadata for a single document
    DocumentMetadata fetchOne(final UUID id);

    //return the entire consolidated form of the document,
    //that contains the metadata and the breakdown into units
    DocumentConsolidatedDto fetchOneConsolidated(final UUID id);

    //create a single document, including metadata and breakdown
    DocumentConsolidated create(final DocumentViewDto document);

    //update a single document
    DocumentConsolidated update(final UUID id,
                                final DocumentViewDto document);

    //delete a document based on id
    void deleteById(final UUID id);
}