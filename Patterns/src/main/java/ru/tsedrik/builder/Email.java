package ru.tsedrik.builder;

import java.util.HashSet;
import java.util.stream.Collectors;

public class Email {
    private String subject;
    private String from;
    private HashSet<String> emailTo = new HashSet<>();
    private HashSet<String> emailCopyTo = new HashSet<>();
    private Content content;

    protected Email(String subject, String from, HashSet<String> emailTo, HashSet<String> emailCopyTo, Content content) {
        this.subject = subject;
        this.from = from;
        this.emailTo.addAll(emailTo);
        this.emailCopyTo.addAll(emailCopyTo.stream()
                .filter(s -> !emailTo.contains(s))
                .collect(Collectors.toSet()));
        this.content = new Content(content.getBody(), content.getSignature());
    }

    @Override
    public String toString() {
        return "Email{" + "\n" +
                "Subject: " + subject + "\n" +
                "From: " + from + "\n" +
                "To: " + emailTo + "\n" +
                (!emailCopyTo.isEmpty() ? ("CC: " + emailCopyTo + "\n") : "") +
                content.getBody() + "\n\n" +
                content.getSignature() + "\n" +
                '}';
    }
}
