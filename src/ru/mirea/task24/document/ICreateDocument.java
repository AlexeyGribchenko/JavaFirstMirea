package ru.mirea.task24.document;

public interface ICreateDocument {

    IDocument CreateNew(String stFolder, String stName, int iSize);

    IDocument CreateOpen(String stName);
}