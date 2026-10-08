package com.example.helloworld;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public final class HelloWorldMod implements ModInitializer {
    @Override
    public void onInitialize() {
        Path file = FabricLoader.getInstance()
                .getGameDir()
                .resolve("hello_world.txt");

        try {
            Files.writeString(file, "hello world\n", StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.err.println("[Hello World File] Could not create " + file);
            e.printStackTrace();
        }
    }
}
