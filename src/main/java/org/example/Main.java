package org.example;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {

        new CustomWebApplicationServer(8080).start();
    }
}
