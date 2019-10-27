package by.epam.accounting_finance.service.impl;


import by.epam.accounting_finance.service.FileService;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;


public class FileServiceImpl implements FileService {

    @Override
    public byte[] getUsersData(String name){
        byte[] userBytes = null;
        try {
            userBytes = Files.readAllBytes(new File(USER_FILE_PATH + "/" + name).toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return userBytes;
    }


}
