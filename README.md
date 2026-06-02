<div align="center">

# ✨ Lumora

**High-performance Minecraft server software for the modern era**

[![License: GPL-3.0](https://img.shields.io/badge/license-GPL--3.0-blue.svg)](LICENSE.md)

</div>

## About

Lumora is a high-performance Minecraft server fork based on [LeafMC](https://github.com/Winds-Studio/Leaf), which itself is a [Paper](https://papermc.io/) fork incorporating optimizations from [Lithium](https://github.com/CaffeineMC/lithium-fabric), SIMD math operations, and over 332 optimization patches. Lumora takes this foundation and rebrands it with a unique identity while maintaining full compatibility with the Paper plugin ecosystem.

## Features

- **Multithreaded Entity Tracker** — Parallel entity tracking for significant performance gains
- **SIMD Math** — Hardware-accelerated math operations using Java's vector API
- **Async Pathfinding** — Non-blocking pathfinding calculations
- **Collision Optimization** — Efficient collision detection algorithms
- **Optimized Collections** — Data structures tuned for Minecraft server workloads
- **Virtual Thread Support** — Leveraging Java 21's virtual threads for better concurrency
- **Reduced Allocations** — Minimized object allocation to reduce GC pressure
- **Mob Spawn Optimization** — Streamlined mob spawning logic for better performance
- **Full Spigot/Paper Plugin Compatibility** — Works with existing plugins seamlessly
- **Latest Dependencies** — Kept up-to-date with cutting-edge libraries

## Requirements

- **Java 21** or newer
- **Minecraft 1.21.x** server support

## Installation

### Building from Source

```bash
git clone https://github.com/kyssta-exe/Lumora-server.git
cd Lumora-server
./gradlew applyAllPatches && ./gradlew createMojmapPaperclipJar
```

The built server jar will be available in `paper-server/build/libs/`.

### Running

```bash
java -jar lumora-paperclip-*.jar nogui
```

Make sure to accept the Minecraft EULA by creating `eula.txt` with `eula=true`.

## Credits

Lumora would not be possible without these outstanding projects:

- [**LeafMC**](https://github.com/Winds-Studio/Leaf) — The upstream fork providing the foundation for Lumora
- [**PaperMC**](https://papermc.io/) — The high-performance Minecraft server base
- [**GaleMC**](https://github.com/GaleMC/Gale) — Additional optimizations and branding patterns
- [**Lithium**](https://github.com/CaffeineMC/lithium-fabric) — General-purpose optimization mod for Minecraft
- [**Pufferfish**](https://github.com/pufferfish-gg/Pufferfish) — Performance-focused patches and Sentry integration

## License

Lumora is licensed under the [GNU General Public License v3.0](LICENSE.md).

## Author

**Kyssta** — [GitHub: @kyssta-exe](https://github.com/kyssta-exe)
