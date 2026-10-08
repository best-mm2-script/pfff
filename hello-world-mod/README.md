# Hello World File — Fabric mod

Minecraft Java Edition Fabric mod for **1.21.1**.

When Minecraft starts with the mod loaded, it creates (or replaces) this file:

`<Minecraft game directory>/hello_world.txt`

The file contains:

```text
hello world
```

## Build

Requires Java 21 and an environment with access to the Fabric/Maven repositories.

```bash
./gradlew build
```

The compiled JAR will be in `build/libs/`.

## Install

Put the built JAR in the Minecraft `mods` folder together with Fabric Loader and Fabric API for Minecraft 1.21.1.
