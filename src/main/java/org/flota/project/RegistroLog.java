package org.flota.project;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RegistroLog {

    public static RegistroLog registro;
    public static final int CONSOLE_CHANNEL = 1;
    public static final int FILE_CHANNEL = 2;

    public static synchronized RegistroLog getInstance() {

        if (registro == null) {
            registro = new RegistroLog();
        }
        return registro;
    }

    public void log(String mensaje, int type) throws IOException {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        mensaje = dtf.format(now) + " " + mensaje;

        switch (type) {
            case CONSOLE_CHANNEL:
                System.out.println( mensaje );
            break;

            case FILE_CHANNEL:
                BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt"));
                writer.write(mensaje);
                writer.close();
            break;

            default:
                System.out.println( mensaje );
            break;
        }
    }

    public void info(String mensaje, int type) throws IOException {
        log("INFO: " + mensaje, type);
    }

    public void error(String mensaje, int type) throws IOException {
        log("ERROR: " + mensaje, type);
    }
    
    public void debug(String mensaje, int type) throws IOException {
        log("DEBUG: " + mensaje, type);
    }
}