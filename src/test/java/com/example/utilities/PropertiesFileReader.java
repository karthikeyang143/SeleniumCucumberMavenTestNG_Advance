package com.example.utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

    public class PropertiesFileReader {
        private Properties properties;
        private final String propertyFilePath= "src//test//resources//config.properties";

        public PropertiesFileReader(){
            BufferedReader reader;
            try {
                reader = new BufferedReader(new FileReader(propertyFilePath));
                properties = new Properties();
                try {
                    properties.load(reader);
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                throw new RuntimeException("Config.properties not found at " + propertyFilePath);
            }
        }

        public String getDriverPath(){
            String driverPath = properties.getProperty("driverPath");
            if(driverPath!= null) return driverPath;
            else throw new RuntimeException("driverPath not specified in the Config.properties file.");
        }

        public String getApplicationUrl() {
            String url = properties.getProperty("applicationURL");
            if(url != null) return url;
            else throw new RuntimeException("applicationURL not specified in the Config.properties file.");
        }
    }
