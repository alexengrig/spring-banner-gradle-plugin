/*
 * Copyright 2022-2023 Alexengrig Dev.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.alexengrig.gradle.spring.banner.figlet;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.net.URL;
import java.util.Set;
import java.util.SortedSet;

import static io.github.alexengrig.gradle.spring.banner.figlet.FontLoader.EXTENSION;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.ACROBATIC;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.ALLIGATOR;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.ALLIGATOR2;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.ALLIGATOR3;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.ALPHA;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.ALPHABET;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.AMC3LINE;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.AMCAAA01;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.AMCNEKO;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.AMCRAZO2;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.AMCRAZOR;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.AMCSLASH;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.AMCSLIDER;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.AMCTHIN;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.AMCTUBES;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.AMCUNTITLED;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.ANSIREGULAR;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.ANSISHADOW;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.ARROWS;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.AVATAR;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.B1FF;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.BANNER3;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.BANNER3_D;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.BANNER4;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.BARBWIRE;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.BASIC;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.BEAR;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.BELL;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.BENJAMIN;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.BIGFIG;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.BIGMONEYNE;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.BIGMONEYNW;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.BIGMONEYSE;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.BIGMONEYSW;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.BINARY;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.BLOCKS;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.BLOODY;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.BOLGER;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.BRACED;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.BRIGHT;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.BROADWAY;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.BROADWAY_KB;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.BULBHEAD;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.CALGPHY2;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.CALIGRAPHY;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.CALIGRAPHY2;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.CALVINS;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.CARDS;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.CATWALK;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.CHISELED;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.CHUNKY;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.COINSTAK;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.COLA;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.COLOSSAL;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.COMPUTER;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.CONTESSA;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.CONTRAST;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.COSMIC;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.CRAWFORD;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.CRAWFORD2;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.CRAZY;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.CRICKET;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.CURSIVE;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.CYBERLARGE;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.CYBERMEDIUM;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.CYBERSMALL;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.CYGNET;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.DANCINGFONT;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.DECIMAL;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.DEFLEPPARD;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.DELTACORPSPRIEST1;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.DIAMOND;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.DIETCOLA;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.DOH;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.DOOM;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.DOS_REBEL;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.DOTMATRIX;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.DOUBLE;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.DOUBLESHORTS;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.DRPEPPER;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.EFTIFONT;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.EFTIROBOT;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.EFTITALIC;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.ELECTRONIC;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.ELITE;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.EPIC;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.FENDER;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.FILTER;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.FIREFONTK;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.FIREFONTS;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.FIVE_LINEOBLIQUE;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.FLIPPED;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.FLOWERPOWER;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.FONTS_DIRECTORY;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.FOUR_MAX;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.FRAKTUR;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.FUNFACE;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.FUNFACES;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.FUZZY;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.GEORGI16;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.GEORGIA11;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.GHOST;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.GHOULISH;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.GLENYN;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.GOOFY;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.GOTHIC;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.GRACEFUL;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.GRADIENT;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.GRAFFITI;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.GREEK;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.HEARTLEFT;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.HEARTRIGHT;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.HENRY3D;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.HEX;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.HIEROGLYPHS;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.HOLLYWOOD;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.HORIZONTALLEFT;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.HORIZONTALRIGHT;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.IMPOSSIBLE;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.ISOMETRIC1;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.ISOMETRIC2;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.ISOMETRIC3;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.ISOMETRIC4;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.JAZMINE;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.JERUSALEM;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.JSBLOCKLETTERS;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.JSBRACKETLETTERS;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.JSCAPITALCURVES;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.JSCURSIVE;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.KATAKANA;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.KBAN;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.KEYBOARD;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.KNOB;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.LARRY3D;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.LCD;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.LETTERS;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.LILDEVIL;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.LINEBLOCKS;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.LINUX;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.LOCKERGNOME;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.MADRID;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.MARQUEE;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.MAXFOUR;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.MERLIN1;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.MERLIN2;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.MIRROR;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.MODULAR;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.MORSE;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.MOSCOW;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.MSHEBREW210;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.MUZZLE;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.NANCYJ;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.NANCYJFANCY;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.NANCYJIMPROVED;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.NANCYJUNDERLINED;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.NIPPLES;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.NSCRIPT;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.O8;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.OCTAL;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.OLDBANNER;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.ONE_ROW;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.OS2;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.PATORJKHEX;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.PATORJKSCHEESE;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.PAWP;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.PEAKS;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.PEBBLES;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.PEPPER;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.POISON;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.PUFFY;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.PUZZLE;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.RAMMSTEIN;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.RECTANGLES;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.REDPHOENIX;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.RELIEF;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.RELIEF2;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.REVERSE;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.ROMAN;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.ROUNDED;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.ROWANCAP;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.ROZZO;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.SANTACLARA;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.SBLOOD;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.SERIFCAP;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.SHIMROD;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.SHORT;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.SLANTRELIEF;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.SLIDE;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.SMALLCAPS;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.SMISOME1;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.SMKEYBOARD;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.SMPOISON;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.SOFT;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.SPEED;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.SPLIFF;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.STACEY;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.STAMPATE;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.STARSTRIPS;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.STARWARS;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.STELLAR;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.STICKLETTERS;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.STOP;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.STRAIGHT;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.STRONGERTHANALL;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.SUBZERO;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.SWAMPLAND;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.SWAN;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.SWEET;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.TANJA;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.TENGWAR;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.TEST1;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.THEEDGE;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.THICK;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.THIN;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.THIS;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.THORNED;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.THREED;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.THREED2;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.THREEDASCII;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.THREEDDIAGONAL;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.THREEPOINT;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.THREE_X_FIVE;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.TICKS;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.TICKSSLANT;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.TILES;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.TINKERTOY;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.TOMBSTONE;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.TRAIN;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.TREK;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.TSALAGI;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.TUBULAR;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.TWISTED;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.TWOPOINT;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.UNIVERS;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.USAFLAG;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.VARSITY;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.WAVY;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.WEIRD;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.WETLETTER;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.WHIMSY;
import static io.github.alexengrig.gradle.spring.banner.figlet.LocalFontLoader.WOW;
import static org.assertj.core.api.Assertions.assertThat;

class LocalFontLoaderTest {

    @Test
    void should_return_fontNames() {
        Set<String> values = LocalFontLoader.fontNames();
        Set<String> expected;
        {
            expected = Set.of(
                    ONE_ROW,
                    THREED,
                    THREEDASCII,
                    THREEDDIAGONAL,
                    THREE_X_FIVE,
                    THREED2,
                    FOUR_MAX,
                    FIVE_LINEOBLIQUE,
                    ACROBATIC,
                    ALLIGATOR,
                    ALLIGATOR2,
                    ALLIGATOR3,
                    ALPHA,
                    ALPHABET,
                    AMC3LINE,
                    AMCAAA01,
                    AMCNEKO,
                    AMCRAZO2,
                    AMCRAZOR,
                    AMCSLASH,
                    AMCTHIN,
                    AMCTUBES,
                    AMCSLIDER,
                    AMCUNTITLED,
                    ANSIREGULAR,
                    ANSISHADOW,
                    ARROWS,
                    AVATAR,
                    B1FF,
                    BANNER3,
                    BANNER3_D,
                    BANNER4,
                    BARBWIRE,
                    BASIC,
                    BEAR,
                    BELL,
                    BENJAMIN,
                    BIGFIG,
                    BIGMONEYNE,
                    BIGMONEYNW,
                    BIGMONEYSE,
                    BIGMONEYSW,
                    BINARY,
                    BLOCKS,
                    BLOODY,
                    BOLGER,
                    BRACED,
                    BRIGHT,
                    BROADWAY,
                    BROADWAY_KB,
                    BULBHEAD,
                    CALGPHY2,
                    CALIGRAPHY,
                    CALIGRAPHY2,
                    CALVINS,
                    CARDS,
                    CATWALK,
                    CHISELED,
                    CHUNKY,
                    COINSTAK,
                    COLA,
                    COLOSSAL,
                    COMPUTER,
                    CONTESSA,
                    CONTRAST,
                    COSMIC,
                    CRAWFORD,
                    CRAWFORD2,
                    CRAZY,
                    CRICKET,
                    CURSIVE,
                    CYBERLARGE,
                    CYBERMEDIUM,
                    CYBERSMALL,
                    CYGNET,
                    DANCINGFONT,
                    DECIMAL,
                    DEFLEPPARD,
                    DELTACORPSPRIEST1,
                    DIAMOND,
                    DIETCOLA,
                    DOH,
                    DOOM,
                    DOS_REBEL,
                    DOTMATRIX,
                    DOUBLE,
                    DOUBLESHORTS,
                    DRPEPPER,
                    EFTIFONT,
                    EFTIROBOT,
                    EFTITALIC,
                    ELECTRONIC,
                    ELITE,
                    EPIC,
                    FENDER,
                    FILTER,
                    FIREFONTK,
                    FIREFONTS,
                    FLIPPED,
                    FLOWERPOWER,
                    FRAKTUR,
                    FUNFACE,
                    FUNFACES,
                    FUZZY,
                    GEORGI16,
                    GEORGIA11,
                    GHOST,
                    GHOULISH,
                    GLENYN,
                    GOOFY,
                    GOTHIC,
                    GRACEFUL,
                    GRADIENT,
                    GRAFFITI,
                    GREEK,
                    HEARTLEFT,
                    HEARTRIGHT,
                    HENRY3D,
                    HEX,
                    HIEROGLYPHS,
                    HOLLYWOOD,
                    HORIZONTALLEFT,
                    HORIZONTALRIGHT,
                    IMPOSSIBLE,
                    ISOMETRIC1,
                    ISOMETRIC2,
                    ISOMETRIC3,
                    ISOMETRIC4,
                    JAZMINE,
                    JERUSALEM,
                    JSBLOCKLETTERS,
                    JSBRACKETLETTERS,
                    JSCAPITALCURVES,
                    JSCURSIVE,
                    KATAKANA,
                    KBAN,
                    KEYBOARD,
                    KNOB,
                    LARRY3D,
                    LCD,
                    LETTERS,
                    LILDEVIL,
                    LINEBLOCKS,
                    LINUX,
                    LOCKERGNOME,
                    MADRID,
                    MARQUEE,
                    MAXFOUR,
                    MERLIN1,
                    MERLIN2,
                    MIRROR,
                    MODULAR,
                    MORSE,
                    MOSCOW,
                    MSHEBREW210,
                    MUZZLE,
                    NANCYJ,
                    NANCYJFANCY,
                    NANCYJIMPROVED,
                    NANCYJUNDERLINED,
                    NIPPLES,
                    NSCRIPT,
                    O8,
                    OCTAL,
                    OLDBANNER,
                    OS2,
                    PATORJKSCHEESE,
                    PATORJKHEX,
                    PAWP,
                    PEAKS,
                    PEBBLES,
                    PEPPER,
                    POISON,
                    PUFFY,
                    PUZZLE,
                    RAMMSTEIN,
                    RECTANGLES,
                    REDPHOENIX,
                    RELIEF,
                    RELIEF2,
                    REVERSE,
                    ROMAN,
                    ROUNDED,
                    ROWANCAP,
                    ROZZO,
                    SANTACLARA,
                    SBLOOD,
                    SERIFCAP,
                    SHIMROD,
                    SHORT,
                    SLANTRELIEF,
                    SLIDE,
                    SMALLCAPS,
                    SMISOME1,
                    SMKEYBOARD,
                    SMPOISON,
                    SOFT,
                    SPEED,
                    SPLIFF,
                    STACEY,
                    STAMPATE,
                    STARSTRIPS,
                    STARWARS,
                    STELLAR,
                    STICKLETTERS,
                    STOP,
                    STRAIGHT,
                    STRONGERTHANALL,
                    SUBZERO,
                    SWAMPLAND,
                    SWAN,
                    SWEET,
                    TANJA,
                    TENGWAR,
                    TEST1,
                    THEEDGE,
                    THICK,
                    THIN,
                    THIS,
                    THORNED,
                    THREEPOINT,
                    TICKS,
                    TICKSSLANT,
                    TILES,
                    TINKERTOY,
                    TOMBSTONE,
                    TRAIN,
                    TREK,
                    TSALAGI,
                    TUBULAR,
                    TWISTED,
                    TWOPOINT,
                    UNIVERS,
                    USAFLAG,
                    VARSITY,
                    WAVY,
                    WEIRD,
                    WETLETTER,
                    WHIMSY,
                    WOW
            );
        }
        assertThat(values)
                .as("names")
                .hasSize(240)
                .containsAll(expected);
    }

    @Test
    void should_have_file_for_fontName() {
        ClassLoader loader = LocalFontLoader.class.getClassLoader();
        SoftAssertions.assertSoftly(softly -> {
            for (String name : LocalFontLoader.fontNames()) {
                String resourcePath = FONTS_DIRECTORY + name + EXTENSION;
                URL resource = loader.getResource(resourcePath);
                softly.assertThat(resource)
                        .as(resourcePath)
                        .isNotNull();
            }
        });
    }

    @Test
    void should_have_fontName_for_file() {
        URL resource = LocalFontLoader.class.getClassLoader().getResource(FONTS_DIRECTORY);
        Assertions.assertNotNull(resource, "directory " + FONTS_DIRECTORY);
        File[] fontFiles = new File(resource.getFile()).listFiles();
        Assertions.assertNotNull(fontFiles, "files of directory " + FONTS_DIRECTORY);
        SortedSet<String> names = LocalFontLoader.fontNames();
        SoftAssertions.assertSoftly(softly -> {
            for (File file : fontFiles) {
                String filename = file.getName();
                if (FontLoader.isFontByFilename(filename)) {
                    String fontName = FontLoader.getFontNameByFilename(filename);
                    softly.assertThat(names.contains(fontName))
                            .as("No font '" + fontName + "' for file: " + filename)
                            .isTrue();
                }
            }
        });
    }

}
