package ru.tsedrik.builder;

import java.util.*;

public class EmailBuilder {

    public IFromOrToBuilder subject(String subject){
        return new FromOrToBuilder(subject);
    }

    public interface IFromOrToBuilder extends IToBuilder{
        IFirstToBuilder from(String from);
    }

    public interface IFirstToBuilder{
        IToOrCopyToOrContentBuilder to(String to);
        IToOrCopyToOrContentBuilder toAll(List<String> toAll);
    }

    public interface IToOrCopyToOrContentBuilder extends IToBuilder, ICopyToBuilder, IContentBuilder{
    }

    public interface ICopyToOrContentBuilder extends ICopyToBuilder, IContentBuilder{
    }

    public interface IFinalBuilder{
        Email build();
    }

    public interface IToBuilder{
        IToOrCopyToOrContentBuilder to(String to);
        IToOrCopyToOrContentBuilder toAll(List<String> toAll);
    }

    public interface ICopyToBuilder{
        ICopyToOrContentBuilder copyTo(String copyTo);
        ICopyToOrContentBuilder copyToAll(List<String> copyToAll);
    }

    public interface IContentBuilder{
        IFinalBuilder content(Content content);
    }

    private class FromOrToBuilder implements IFromOrToBuilder{
        private String emailSubject;
        private HashSet<String> emailTo = new HashSet<>();

        public FromOrToBuilder(String emailSubject) {
            this.emailSubject = emailSubject;
        }

        @Override
        public IFirstToBuilder from(String emailFrom) {
            return new FirstToBuilder(emailSubject, emailFrom);
        }

        @Override
        public IToOrCopyToOrContentBuilder to(String to) {
            addToSet(emailTo, Arrays.asList(to));
            return new ToOrCopyToOrContentBuilder(emailSubject, "anonymous", emailTo);
        }

        @Override
        public IToOrCopyToOrContentBuilder toAll(List<String> toAll) {
            addToSet(emailTo, toAll);
            return new ToOrCopyToOrContentBuilder(emailSubject, "anonymous", emailTo);
        }
    }

    private class FirstToBuilder implements IFirstToBuilder{
        private String emailSubject;
        private String emailFrom;
        private HashSet<String> emailTo = new HashSet<>();

        public FirstToBuilder(String emailSubject, String emailFrom) {
            this.emailSubject = emailSubject;
            this.emailFrom = emailFrom;
        }

        @Override
        public IToOrCopyToOrContentBuilder to(String to) {
            addToSet(emailTo, Arrays.asList(to));
            return new ToOrCopyToOrContentBuilder(emailSubject, emailFrom, emailTo);
        }

        @Override
        public IToOrCopyToOrContentBuilder toAll(List<String> toAll) {
            addToSet(emailTo, toAll);
            return new ToOrCopyToOrContentBuilder(emailSubject, emailFrom, emailTo);
        }
    }

    private class ToOrCopyToOrContentBuilder implements IToOrCopyToOrContentBuilder{
        private String emailSubject;
        private String emailFrom;
        private HashSet<String> emailTo;
        private HashSet<String> emailCopyTo = new HashSet<>();

        public ToOrCopyToOrContentBuilder(String emailSubject, String emailFrom, HashSet<String> emailTo) {
            this.emailSubject = emailSubject;
            this.emailFrom = emailFrom;
            this.emailTo = emailTo;
        }

        @Override
        public IToOrCopyToOrContentBuilder to(String to) {
            addToSet(emailTo, Arrays.asList(to));
            return this;
        }

        @Override
        public IToOrCopyToOrContentBuilder toAll(List<String> toAll) {
            addToSet(emailTo, toAll);
            return this;
        }

        @Override
        public ICopyToOrContentBuilder copyTo(String copyTo) {
            addCopyToSet(emailCopyTo, Arrays.asList(copyTo));
            return new CopyToOrContentBuilder(emailSubject, emailFrom, emailTo, emailCopyTo);
        }

        @Override
        public ICopyToOrContentBuilder copyToAll(List<String> copyToAll) {
            addCopyToSet(emailCopyTo, copyToAll);
            return new CopyToOrContentBuilder(emailSubject, emailFrom, emailTo, emailCopyTo);
        }

        @Override
        public IFinalBuilder content(Content content) {
            return new FinalBuilder(emailSubject, emailFrom, emailTo, emailCopyTo, content);
        }
    }

    private class CopyToOrContentBuilder implements ICopyToOrContentBuilder{
        private String emailSubject;
        private String emailFrom;
        private HashSet<String> emailTo;
        private HashSet<String> emailCopyTo;

        public CopyToOrContentBuilder(String emailSubject, String emailFrom, HashSet<String> emailTo, HashSet<String> emailCopyTo) {
            this.emailSubject = emailSubject;
            this.emailFrom = emailFrom;
            this.emailTo = emailTo;
            this.emailCopyTo = emailCopyTo;
        }

        @Override
        public ICopyToOrContentBuilder copyTo(String copyTo) {
            addCopyToSet(emailCopyTo, Arrays.asList(copyTo));
            return this;
        }

        @Override
        public ICopyToOrContentBuilder copyToAll(List<String> copyToAll) {
            addCopyToSet(emailCopyTo, copyToAll);
            return this;
        }

        @Override
        public IFinalBuilder content(Content content) {
            return new FinalBuilder(emailSubject, emailFrom, emailTo, emailCopyTo, content);
        }
    }

    private class FinalBuilder implements IFinalBuilder{
        private String emailSubject;
        private String emailFrom;
        private HashSet<String> emailTo;
        private HashSet<String> emailCopyTo;
        private Content content;

        public FinalBuilder(String emailSubject, String emailFrom, HashSet<String> emailTo, HashSet<String> emailCopyTo, Content content) {
            this.emailSubject = emailSubject;
            this.emailFrom = emailFrom;
            this.emailTo = emailTo;
            this.emailCopyTo = emailCopyTo;
            this.content = content;
        }

        @Override
        public Email build() {
            return new Email(emailSubject, emailFrom,
                    emailTo, emailCopyTo, content);
        }
    }

    private void addToSet(Set<String> emailToSet, List<String> toList){
        emailToSet.addAll(toList);
    }

    private void addCopyToSet(Set<String> emailCopyToSet, List<String> copyToList){
        emailCopyToSet.addAll(copyToList);
    }

}
