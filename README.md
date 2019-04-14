![](https://i.imgur.com/sBLouZ7.png)

[![Discord](https://img.shields.io/discord/373382904769675265.svg)](https://discord.gg/HN5gf3m) [![Travis](https://travis-ci.com/zeruth/runelit.svg?branch=master)](https://travis-ci.com/zeruth/runelit)  
RuneLit is a fork of [RuneLite](https://github.com/runelite/runelite) that includes additional plugins  
  
# Notable Features:

### Bytecode Modified Injected Client  
Caches the injected client at runtime, and attempts to load a modified copy if it exists.  
This allows you to undo a lot of the restrictions the RL team have imposed. Currently included bytecode patches are:  
RSActor.animationChanged is no longer filtered.  
ProjectileMoved is no longer filtered.  
Player.getSkullIcon is no longer restricted to localPlayer.  
Client.getCollisionMaps is no longer filtered.  
RSActor.getAnimation is no longer filtered.  

  
### Flexo, the Robot  
A very flexible mouse input assistant. Includes a plugin for on the fly configuration.  
Uses https://github.com/JoonasVali/NaturalMouseMotion  
Settings:  
![](https://i.imgur.com/2caAk5H.png)  
Example of settings in action  
![](https://i.imgur.com/i7Ia5kO.gif)  

  
*Auto Pray Flick  
*Auto Switcher

### How To Use
To use RuneLit, you can build the project yourself by following RuneLite's [guide to building with IntelliJ IDEA](https://github.com/runelite/runelite/wiki/Building-with-IntelliJ-IDEA).

Alternatively, you can download a release from [RELEASES](https://github.com/zeruth/runelit/releases)
