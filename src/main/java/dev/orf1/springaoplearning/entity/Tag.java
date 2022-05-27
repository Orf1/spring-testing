package dev.orf1.springaoplearning.entity;

import java.util.UUID;

public class Tag {
    private UUID uuid;
    private String tagName;
    private String tagEmail;
    private String tagNotes;
    private String contactName;
    private String contactEmail;
    private String contactNumber;
    private String metadata;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getTagEmail() {
        return tagEmail;
    }

    public void setTagEmail(String tagEmail) {
        this.tagEmail = tagEmail;
    }

    public String getTagNotes() {
        return tagNotes;
    }

    public void setTagNotes(String tagNotes) {
        this.tagNotes = tagNotes;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    @Override
    public String toString() {
        return "\nTag{" + "uuid=" + uuid + ", tagName='" + tagName + '\'' + ", tagEmail='" + tagEmail + '\'' + ", tagNotes='" + tagNotes + '\'' + ", contactName='" + contactName + '\'' + ", contactEmail='" + contactEmail + '\'' + ", contactNumber='" + contactNumber + '\'' + ", metadata='" + metadata + '\'' + '}';
    }
}