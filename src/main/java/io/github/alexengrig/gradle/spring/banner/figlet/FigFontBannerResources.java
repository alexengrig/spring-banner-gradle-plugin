/*
 * Copyright 2022 Alexengrig Dev.
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

import java.util.Set;

@SuppressWarnings("SpellCheckingInspection")
final class FigFontBannerResources {

    /**
     * {@code fonts/1row.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * '| /? () \/\/
     * }</pre>
     */
    public static final String ONE_ROW = "1row";

    /**
     * {@code fonts/3d.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ████      ██     �
     * █░░░��██     ░�
     * █░    ░�█  ████
     * █   ██�██ ██░�
     * �   ░░░ �░██░█�
     * █ █   ░�  ░██░░
     * ��░ ██�██████
     * �█  ░░� ░░░░░�
     * }</pre>
     */
    public static final String THREED = "3d";

    /**
     * {@code fonts/3d_ascii.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ________  ________      ________  ________  ________  ___  ___
     * |\_____  \|\   ___ \    |\   __  \|\   ____\|\   ____\|\  \|\  \
     * \|____|\ /\ \  \_|\ \   \ \  \|\  \ \  \___|\ \  \___|\ \  \ \  \
     * \|\  \ \  \ \\ \   \ \   __  \ \_____  \ \  \    \ \  \ \  \
     * __\_\  \ \  \_\\ \   \ \  \ \  \|____|\  \ \  \____\ \  \ \  \
     * |\_______\ \_______\   \ \__\ \__\____\_\  \ \_______\ \__\ \__\
     * \|_______|\|_______|    \|__|\|__|\_________\|_______|\|__|\|__|
     * \|_________|
     * }</pre>
     */
    public static final String THREED_ASCII = "3d_ascii";

    /**
     * {@code fonts/3d_diagonal.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     *
     * .--,-``-.
     * /   /     '.                                                                                                     ,--,
     * / ../        ;       ,---,                 ,---,  ,--,                                                          ,--.'|
     * \ ``\  .`-    '    ,---.'|               ,---.'|,--.'|                            ,---.        ,---,            |  | :
     * \___\/   \   :    |   | :               |   | :|  |,                 ,----._,.  '   ,'\   ,-+-. /  |           :  : '
     * \   :   |    |   | |               |   | |`--'_      ,--.--.   /   /  ' / /   /   | ,--.'|'   |  ,--.--.  |  ' |
     * /  /   /   ,--.__| |             ,--.__| |,' ,'|    /       \ |   :     |.   ; ,. :|   |  ,"' | /       \ '  | |
     * \  \   \  /   ,'   |            /   ,'   |'  | |   .--.  .-. ||   | .\  .'   | |: :|   | /  | |.--.  .-. ||  | :
     * ___ /   :   |.   '  /  |           .   '  /  ||  | :    \__\/: . ..   ; ';  |'   | .; :|   | |  | | \__\/: . .'  : |__
     * /   /\   /   :'   ; |:  |       ___ '   ; |:  |'  : |__  ," .--.; |'   .   . ||   :    ||   | |  |/  ," .--.; ||  | '.'|
     * / ,,/  ',-    .|   | '/  '    .'  .`||   | '/  '|  | '.'|/  /  ,.  | `---`-'| | \   \  / |   | |--'  /  /  ,.  |;  :    ;
     * \ ''\        ; |   :    :| .'  .'   :|   :    :|;  :    ;  :   .'   \.'__/\_: |  `----'  |   |/     ;  :   .'   \  ,   /
     * \   \     .'   \   \  /,---, '   .'  \   \  /  |  ,   /|  ,     .-./|   :    :          '---'      |  ,     .-./---`-'
     * `--`-,,-'      `----' ;   |  .'      `----'    ---`-'  `--`---'     \   \  /                       `--`---'
     * `---'                                          `--`-'
     * }</pre>
     */
    public static final String THREED_DIAGONAL = "3d_diagonal";

    /**
     * {@code fonts/3x5.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     *
     * ###     ###
     * # # # #
     * ##  #  ###
     * # # #   #
     * ###     ###
     * }</pre>
     */
    public static final String THREE_X_FIVE = "3x5";

    /**
     * {@code fonts/3_d.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     *   ****             **
     *  * /// *          /**
     * /    /*          /**
     *    ***         ******
     *   /// *       ** //**
     * *   /*      /**  /**
     * / ****    ***** /
     * / ****  ***** // *****
     *  ////  /////  //////
     * }</pre>
     */
    public static final String THREE_D = "3_d";

    /**
     * {@code fonts/4max.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * dP88  8b    d8    db    Yb  dP
     * dP 88  88b  d88   dPYb    YbdP
     * d888888 88YbdP88  dP__Yb   dPYb
     * 88  88 YY 88 dP""""Yb dP  Yb
     * }</pre>
     */
    public static final String FOUR_MAX = "4max";

    /**
     * {@code fonts/5lineoblique.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     *
     *
     * ____
     * //         //     ( )       __        ___        ___       / __       //     ( )      ___                   ___
     * //__       //     / /     //   ) )   //___) )   //   ) )   //   ) )   //     / /     //   ) )   //   / /   //___) )
     * ) )   //     / /     //   / /   //         //   / /   //   / /   //     / /     ((___/ /   //   / /   //
     * ((___/ /   //     / /     //   / /   ((____     ((___/ /   ((___/ /   //     / /          ( (   ((___( (   ((____
     * }</pre>
     */
    public static final String FIVE_LINEOBLIQUE = "5lineoblique";

    /**
     * {@code fonts/5_line_oblique.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     *
     * ____
     * //               //     ( )       __        ___              ___       / __       //     ( )      ___                   ___
     * //__             //     / /     //   ) )   //___) )         //   ) )   //   ) )   //     / /     //   ) )   //   / /   //___) )
     * ) )         //     / /     //   / /   //               //   / /   //   / /   //     / /     ((___/ /   //   / /   //
     * ((___/ /   _____ //     / /     //   / /   ((____     _____ ((___/ /   ((___/ /   //     / /          ( (   ((___( (   ((____
     * }</pre>
     */
    public static final String FIVE_LINE_OBLIQUE = "5_line_oblique";

    /**
     * {@code fonts/acrobatic.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * o                                            o                         o        o
     * <|>                                          <|>                       <|>     _<|>_
     * / \                                          / >                       < >
     * o/   \o         __o__  \o__ __o     o__ __o    \o__ __o        o__ __o/   |        o        __o__
     * <|__ __|>       />  \    |     |>   /v     v\    |     v\      /v     |    o__/_   <|>      />  \
     * /       \     o/        / \   < >  />       <\  / \     <\    />     / \   |       / \    o/
     * o/         \o  <|         \o/        \         /  \o/      /    \      \o/   |       \o/   <|
     * /v           v\  \\         |          o       o    |      o      o      |    o        |     \\
     * />             <\  _\o__</  / \         <\__ __/>   / \  __/>      <\__  / \   <\__    / \     _\o__</
     *
     *
     *
     * }</pre>
     */
    public static final String ACROBATIC = "acrobatic";

    /**
     * {@code fonts/alligator.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * :::        :::        :::        :::::::::::       ::::::::           :::    :::::::::::       ::::::::       :::::::::
     * :+: :+:      :+:        :+:            :+:          :+:    :+:        :+: :+:      :+:          :+:    :+:      :+:    :+:
     * +:+   +:+     +:+        +:+            +:+          +:+              +:+   +:+     +:+          +:+    +:+      +:+    +:+
     * +#++:++#++:    +#+        +#+            +#+          :#:             +#++:++#++:    +#+          +#+    +:+      +#++:++#:
     * +#+     +#+    +#+        +#+            +#+          +#+   +#+#      +#+     +#+    +#+          +#+    +#+      +#+    +#+
     * #+#     #+#    #+#        #+#            #+#          #+#    #+#      #+#     #+#    #+#          #+#    #+#      #+#    #+#
     * ###     ###    ########## ########## ###########       ########       ###     ###    ###           ########       ###    ###
     * }</pre>
     */
    public static final String ALLIGATOR = "alligator";

    /**
     * {@code fonts/alligator2.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * :::     :::        :::        :::::::::::  ::::::::      :::     :::::::::::  ::::::::  :::::::::   ::::::::
     * :+: :+:   :+:        :+:            :+:     :+:    :+:   :+: :+:       :+:     :+:    :+: :+:    :+: :+:    :+:
     * +:+   +:+  +:+        +:+            +:+     +:+         +:+   +:+      +:+     +:+    +:+ +:+    +:+       +:+
     * +#++:++#++: +#+        +#+            +#+     :#:        +#++:++#++:     +#+     +#+    +:+ +#++:++#:      +#+
     * +#+     +#+ +#+        +#+            +#+     +#+   +#+# +#+     +#+     +#+     +#+    +#+ +#+    +#+   +#+
     * #+#     #+# #+#        #+#            #+#     #+#    #+# #+#     #+#     #+#     #+#    #+# #+#    #+#  #+#
     * ###     ### ########## ########## ###########  ########  ###     ###     ###      ########  ###    ### ##########
     * }</pre>
     */
    public static final String ALLIGATOR2 = "alligator2";

    /**
     * {@code fonts/alligator3.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * :::     :::        :::        :::::::::::  ::::::::      :::     :::::::::::  ::::::::  :::::::::   ::::::::
     * :+: :+:   :+:        :+:            :+:     :+:    :+:   :+: :+:       :+:     :+:    :+: :+:    :+: :+:    :+:
     * +:+   +:+  +:+        +:+            +:+     +:+         +:+   +:+      +:+     +:+    +:+ +:+    +:+        +:+
     * +#++:++#++: +#+        +#+            +#+     :#:        +#++:++#++:     +#+     +#+    +:+ +#++:++#:      +#++:
     * +#+     +#+ +#+        +#+            +#+     +#+   +#+# +#+     +#+     +#+     +#+    +#+ +#+    +#+        +#+
     * #+#     #+# #+#        #+#            #+#     #+#    #+# #+#     #+#     #+#     #+#    #+# #+#    #+# #+#    #+#
     * ###     ### ########## ########## ###########  ########  ###     ###     ###      ########  ###    ###  ########
     * }</pre>
     */
    public static final String ALLIGATOR3 = "alligator3";

    /**
     * {@code fonts/alpha.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * _____                    _____            _____                    _____                    _____
     * /\    \                  /\    \          /\    \                  /\    \                  /\    \
     * /::\    \                /::\____\        /::\    \                /::\____\                /::\    \
     * /::::\    \              /:::/    /       /::::\    \              /:::/    /               /::::\    \
     * /::::::\    \            /:::/    /       /::::::\    \            /:::/    /               /::::::\    \
     * /:::/\:::\    \          /:::/    /       /:::/\:::\    \          /:::/    /               /:::/\:::\    \
     * /:::/__\:::\    \        /:::/    /       /:::/__\:::\    \        /:::/____/               /:::/__\:::\    \
     * /::::\   \:::\    \      /:::/    /       /::::\   \:::\    \      /::::\    \              /::::\   \:::\    \
     * /::::::\   \:::\    \    /:::/    /       /::::::\   \:::\    \    /::::::\    \   _____    /::::::\   \:::\    \
     * /:::/\:::\   \:::\    \  /:::/    /       /:::/\:::\   \:::\____\  /:::/\:::\    \ /\    \  /:::/\:::\   \:::\    \
     * /:::/  \:::\   \:::\____\/:::/____/       /:::/  \:::\   \:::|    |/:::/  \:::\    /::\____\/:::/  \:::\   \:::\____\
     * \::/    \:::\  /:::/    /\:::\    \       \::/    \:::\  /:::|____|\::/    \:::\  /:::/    /\::/    \:::\  /:::/    /
     * \/____/ \:::\/:::/    /  \:::\    \       \/_____/\:::\/:::/    /  \/____/ \:::\/:::/    /  \/____/ \:::\/:::/    /
     * \::::::/    /    \:::\    \               \::::::/    /            \::::::/    /            \::::::/    /
     * \::::/    /      \:::\    \               \::::/    /              \::::/    /              \::::/    /
     * /:::/    /        \:::\    \               \::/____/               /:::/    /               /:::/    /
     * /:::/    /          \:::\    \               ~~                    /:::/    /               /:::/    /
     * /:::/    /            \:::\    \                                   /:::/    /               /:::/    /
     * /:::/    /              \:::\____\                                 /:::/    /               /:::/    /
     * \::/    /                \::/    /                                 \::/    /                \::/    /
     * \/____/                  \/____/                                   \/____/                  \/____/
     *
     * }</pre>
     */
    public static final String ALPHA = "alpha";

    /**
     * {@code fonts/alphabet.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * AA  l      h        b         t
     * A  A l      h        b         t
     * AAAA l ppp  hhh   aa bbb  eee ttt
     * A  A l p  p h  h a a b  b e e  t
     * A  A l ppp  h  h aaa bbb  ee   tt
     * p
     * p
     * }</pre>
     */
    public static final String ALPHABET = "alphabet";

    /**
     * {@code fonts/amc3line.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * .-. .  . .-. -. .   .-. . . .-.
     * |-| |\/| |   -| |    |  |\| |-
     * ` ' '  ` `-' -' `-' `-' ' ` `-'
     *
     * }</pre>
     */
    public static final String AMC3LINE = "amc3line";

    /**
     * {@code fonts/amc3liv1.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * .:;S;:. .:;S;:.         .:;.;:.      :.         .:;S;.        .
     * S  S     )      S     S S  S  S       S .:;s;:'      :: .:;s;::
     * `:;S;:' `:;S;:' `:;S;:' `     ' `:;S;:'         `:;S;'  `     '
     *
     * }</pre>
     */
    public static final String AMC3LIV1 = "amc3liv1";

    /**
     * {@code fonts/amcaaa01.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * .S_SSSs     .S_SsS_S.     sSSs   .S_SSSs     .S_SSSs     .S_SSSs
     * .SS~SSSSS   .SS~S*S~SS.   d%%SP  .SS~SSSSS   .SS~SSSSS   .SS~SSSSS
     * S%S   SSSS  S%S `Y' S%S  d%S'    S%S   SSSS  S%S   SSSS  S%S   SSSS
     * S%S    S%S  S%S     S%S  S%S     S%S    S%S  S%S    S%S  S%S    S%S
     * S%S SSSS%S  S%S     S%S  S&S     S%S SSSS%S  S%S SSSS%S  S%S SSSS%S
     * S&S  SSS%S  S&S     S&S  S&S     S&S  SSS%S  S&S  SSS%S  S&S  SSS%S
     * S&S    S&S  S&S     S&S  S&S     S&S    S&S  S&S    S&S  S&S    S&S
     * S&S    S&S  S&S     S&S  S&S     S&S    S&S  S&S    S&S  S&S    S&S
     * S*S    S&S  S*S     S*S  S*b     S*S    S&S  S*S    S&S  S*S    S&S
     * S*S    S*S  S*S     S*S  S*S.    S*S    S*S  S*S    S*S  S*S    S*S
     * S*S    S*S  S*S     S*S   SSSbs  S*S    S*S  S*S    S*S  S*S    S*S
     * SSS    S*S  SSS     S*S    YSSP  SSS    S*S  SSS    S*S  SSS    S*S
     * SP           SP                  SP          SP          SP
     * Y            Y                   Y           Y           Y
     *
     * }</pre>
     */
    public static final String AMCAAA01 = "amcaaa01";

    /**
     * {@code fonts/amcneko.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * .sSSSSs.
     * SSSSSSSSSs. .sSSSsSS SSsSSSSS .sSSSSs.    .sSSSs.  SSSSS .sSSSSs.    .sSSS  SSSSS  .sSSSSs.
     * S SSS SSSSS S SSS  SSS  SSSSS S SSSSSSSs. S SSS SS SSSSS S SSSSSSSs. S SSS SSSSS   S SSSSSSSs.
     * S  SS SSSSS S  SS   S   SSSSS S  SS SSSS' S  SS  `sSSSSS S  SS SSSS' S  SS SSSSS   S  SS SSSSS
     * S..SSsSSSSS S..SS       SSSSS S..SS       S..SS    SSSSS S..SS       S..SSsSSSSS   S..SS SSSSS
     * S:::S SSSSS S:::S       SSSSS S:::S SSSSS S:::S    SSSSS S:::SSSS    S:::S SSSSS   S:::S SSSSS
     * S;;;S SSSSS S;;;S       SSSSS S;;;S SSSSS S;;;S    SSSSS S;;;S       S;;;S  SSSSS  S;;;S SSSSS
     * S%%%S SSSSS S%%%S       SSSSS S%%%S SSSSS S%%%S    SSSSS S%%%S SSSSS S%%%S  SSSSS  S%%%S SSSSS
     * SSSSS SSSSS SSSSS       SSSSS SSSSSsSSSSS SSSSS    SSSSS SSSSSsSS;:' SSSSS   SSSSS SSSSSsSSSSS
     *
     * }</pre>
     */
    public static final String AMCNEKO = "amcneko";

    /**
     * {@code fonts/amcrazo2.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * . .       . .    .       . .       . .       . .                 . .       . .
     * .+'|=|`+. .+'|=|`+.=|`+. .+'|=|`+. .+'|=|`+. .+'|=|`+. |~~|=|~~| .+'|=|`+. .+'|=|`+.
     * |  | |  | |  | `+ | `+ | |  | `+.| |  | |  | |  | |  | |.+' |  | |  | |  | |.+' |  |
     * |  |=|  | |  |  | |  | | |  |      |  |'. '. |  |=|  |      |.+' |  | |  |    . |  |
     * |  | |  | |  |  | |  | | |  |      |  | |  | |  | |  |    .='    |  | |  | .+'|=|.+'
     * |  | |  | |  |  | |  | | |  |    . |  | |  | |  | |  | .+'|    . |  | |  | |  |    .
     * |  | |  | |  |  | |  | | |  | .+'| |  | |  | |  | |  | |  | .+'| |  | |  | |  | .+'|
     * `+.| |..| `+.|  |.|  |+' `+.|=|.+' `+.| |.+' `+.| |..| |..|=|..| `+.|=|.+' `+.|=|.+'
     *
     * }</pre>
     */
    public static final String AMCRAZO2 = "amcrazo2";

    /**
     * {@code fonts/amcrazor.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ___        __               ___   ___                     __
     * .'|=|`.     .'|\/|`.     .'|=|_.'   .'|=|  |   .'|=|`.    `._|=|   |   .'|=|`.     .'|=|  |
     * .'  | |  `. .'  |  |  `. .'  |      .'  | |  | .'  | |  `.       |  .' .'  | |  `. .'  | |  |
     * |   |=|   | |   |  |   | |   |      |   |=|.'  |   |=|   |   .'|=|.'   |   | |   | |   |=|.'
     * |   | |   | |   |  |   | `.  |  ___ |   |  |`. |   | |   | .'  |  ___  `.  | |  .' |   |  |`.
     * |___| |___| |___|  |___|   `.|=|_.' |___|  |_| |___| |___| |___|=|_.'    `.|=|.'   |___|  |_|
     *
     * }</pre>
     */
    public static final String AMCRAZOR = "amcrazor";

    /**
     * {@code fonts/amcslash.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * .s5SSSs.
     * SS. .s5ssSs.  .s5SSSs.  .s5SSSs.  .s        .s5SSSs.  .s5SSSs.  .s    s.
     * sS    S%S    SS SS.       SS.       SS.                 SS.       SS.       SS.
     * SS    S%S sS SS S%S sS    `:; sS    `:; sS        sS    S%S sS    `:; sS    S%S
     * SSSs. S%S SS :; S%S SS        `:;;;;.   SS        SSSs. S%S `:;;;;.   SSSs. S%S
     * SS    S%S SS    S%S SS              ;;. SS        SS    S%S       ;;. SS    S%S
     * SS    `:; SS    `:; SS              `:; SS        SS    `:;       `:; SS    `:;
     * SS    ;,. SS    ;,. SS    ;,. .,;   ;,. SS    ;,. SS    ;,. .,;   ;,. SS    ;,.
     * :;    ;:' :;    ;:' `:;;;;;:' `:;;;;;:' `:;;;;;:' :;    ;:' `:;;;;;:' :;    ;:'
     *
     * }</pre>
     */
    public static final String AMCSLASH = "amcslash";

    /**
     * {@code fonts/amcslder.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ______                                          ____
     * .'.             .'. .`.        .~      ~.             ..'''' |        |``````.  |            |`````````,
     * .''```.         .'   `   `.     |                    .''       |        |       | |______      |'''|'''''
     * .'       `.     .'           `.   |                 ..'          |        |       | |            |    `.
     * .'           `. .'               `.  `.______.' ....''             |_______ |......'  |___________ |      `.
     *
     * }</pre>
     */
    public static final String AMCSLDER = "amcslder";

    /**
     * {@code fonts/amcthin.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * .-..-..-. .-.-. .-.-. .-..--. .-..-..-. .-.   .-. .-. .-..-.  .-.
     * | | ~ | | | |~.-.~| | | | ~~   ~ | | ~  | | _ | | | | | | ~.-.| |
     * | |.-.| | | |  ~  | | | |        | |    | |`-'| | | | | |   ~ | |
     * | | ~ | | | |     | | | |        | |    | |   | | | | | |     | |
     * | |   | | | |     | | | | __     | |    | |   | | | | | |     | |
     * `-'   `-' `-'     `-' `-'`--'    `-'    `-'   `-' `-' `-'     `-'
     *
     * }</pre>
     */
    public static final String AMCTHIN = "amcthin";

    /**
     * {@code fonts/amctubes.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * d s.   d s   sb   sSSs. sss sssss d       b d ss.  d sss     sss.
     * S  ~O  S  S S S  S          S     S       S S    b S       d
     * S   `b S   S  S S           S     S       S S    P S       Y
     * S sSSO S      S S           S     S       S S sSS' S sSSs    ss.
     * S    O S      S S           S     S       S S    b S            b
     * S    O S      S  S          S      S     S  S    P S            P
     * P    P P      P   "sss'     P       "sss"   P `SS  P sSSss ` ss'
     *
     * }</pre>
     */
    public static final String AMCTUBES = "amctubes";

    /**
     * {@code fonts/amcun1.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ,'',,''',                                         ,'''''',
     * ;  ;',  ;                                         ',,';  ;
     * ;  ;,'  ; ,'',,'',,'', ,'',,'', ,',  ,', ,'',,'',     ;  ;
     * ;  ;',  ; ;  ;', ;', ; ;  ;',,' ; ;  ; ; ;  ;', ;     ;  ;
     * ;  ; ;  ; ;  ; ; ; ; ; ;  ;     ; ;  ; ; ;  ; ; ;     ;  ;
     * ;  ; ;  ; ;  ; ; ; ; ; ;  ;,'', ; ',,' ; ;  ; ; ;     ;  ;
     * ',,' ',,' ',,' ',' ',' ',,'',,' ',,'',,' ',,' ','     ',,'
     *
     * }</pre>
     */
    public static final String AMCUN1 = "amcun1";

    /**
     * {@code fonts/amc_3_line.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * .-. .  . .-. -. .   .-. . . .-.
     * |-| |\/| |   -| |    |  |\| |-
     * ` ' '  ` `-' -' `-' `-' ' ` `-'
     *
     * }</pre>
     */
    public static final String AMC_3_LINE = "amc_3_line";

    /**
     * {@code fonts/amc_3_liv1.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * .:;S;:. .:;S;:.         .:;.;:.      :.         .:;S;.        .
     * S  S     )      S     S S  S  S       S .:;s;:'      :: .:;s;::
     * `:;S;:' `:;S;:' `:;S;:' `     ' `:;S;:'         `:;S;'  `     '
     *
     * }</pre>
     */
    public static final String AMC_3_LIV1 = "amc_3_liv1";

    /**
     * {@code fonts/amc_aaa01.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * .S_SSSs     .S_SsS_S.     sSSs   .S_SSSs     .S_SSSs     .S_SSSs
     * .SS~SSSSS   .SS~S*S~SS.   d%%SP  .SS~SSSSS   .SS~SSSSS   .SS~SSSSS
     * S%S   SSSS  S%S `Y' S%S  d%S'    S%S   SSSS  S%S   SSSS  S%S   SSSS
     * S%S    S%S  S%S     S%S  S%S     S%S    S%S  S%S    S%S  S%S    S%S
     * S%S SSSS%S  S%S     S%S  S&S     S%S SSSS%S  S%S SSSS%S  S%S SSSS%S
     * S&S  SSS%S  S&S     S&S  S&S     S&S  SSS%S  S&S  SSS%S  S&S  SSS%S
     * S&S    S&S  S&S     S&S  S&S     S&S    S&S  S&S    S&S  S&S    S&S
     * S&S    S&S  S&S     S&S  S&S     S&S    S&S  S&S    S&S  S&S    S&S
     * S*S    S&S  S*S     S*S  S*b     S*S    S&S  S*S    S&S  S*S    S&S
     * S*S    S*S  S*S     S*S  S*S.    S*S    S*S  S*S    S*S  S*S    S*S
     * S*S    S*S  S*S     S*S   SSSbs  S*S    S*S  S*S    S*S  S*S    S*S
     * SSS    S*S  SSS     S*S    YSSP  SSS    S*S  SSS    S*S  SSS    S*S
     * SP           SP                  SP          SP          SP
     * Y            Y                   Y           Y           Y
     *
     * }</pre>
     */
    public static final String AMC_AAA01 = "amc_aaa01";

    /**
     * {@code fonts/amc_neko.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * .sSSSSs.
     * SSSSSSSSSs. .sSSSsSS SSsSSSSS .sSSSSs.    .sSSSs.  SSSSS .sSSSSs.    .sSSS  SSSSS  .sSSSSs.
     * S SSS SSSSS S SSS  SSS  SSSSS S SSSSSSSs. S SSS SS SSSSS S SSSSSSSs. S SSS SSSSS   S SSSSSSSs.
     * S  SS SSSSS S  SS   S   SSSSS S  SS SSSS' S  SS  `sSSSSS S  SS SSSS' S  SS SSSSS   S  SS SSSSS
     * S..SSsSSSSS S..SS       SSSSS S..SS       S..SS    SSSSS S..SS       S..SSsSSSSS   S..SS SSSSS
     * S:::S SSSSS S:::S       SSSSS S:::S SSSSS S:::S    SSSSS S:::SSSS    S:::S SSSSS   S:::S SSSSS
     * S;;;S SSSSS S;;;S       SSSSS S;;;S SSSSS S;;;S    SSSSS S;;;S       S;;;S  SSSSS  S;;;S SSSSS
     * S%%%S SSSSS S%%%S       SSSSS S%%%S SSSSS S%%%S    SSSSS S%%%S SSSSS S%%%S  SSSSS  S%%%S SSSSS
     * SSSSS SSSSS SSSSS       SSSSS SSSSSsSSSSS SSSSS    SSSSS SSSSSsSS;:' SSSSS   SSSSS SSSSSsSSSSS
     *
     * }</pre>
     */
    public static final String AMC_NEKO = "amc_neko";

    /**
     * {@code fonts/amc_razor.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ___        __               ___   ___                     __
     * .'|=|`.     .'|\/|`.     .'|=|_.'   .'|=|  |   .'|=|`.    `._|=|   |   .'|=|`.     .'|=|  |
     * .'  | |  `. .'  |  |  `. .'  |      .'  | |  | .'  | |  `.       |  .' .'  | |  `. .'  | |  |
     * |   |=|   | |   |  |   | |   |      |   |=|.'  |   |=|   |   .'|=|.'   |   | |   | |   |=|.'
     * |   | |   | |   |  |   | `.  |  ___ |   |  |`. |   | |   | .'  |  ___  `.  | |  .' |   |  |`.
     * |___| |___| |___|  |___|   `.|=|_.' |___|  |_| |___| |___| |___|=|_.'    `.|=|.'   |___|  |_|
     *
     * }</pre>
     */
    public static final String AMC_RAZOR = "amc_razor";

    /**
     * {@code fonts/amc_razor2.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * . .       . .    .       . .       . .       . .                 . .       . .       . .
     * .+'|=|`+. .+'|=|`+.=|`+. .+'|=|`+. .+'|=|`+. .+'|=|`+. |~~|=|~~| .+'|=|`+. .+'|=|`+. .+'|=|`+.
     * |  | |  | |  | `+ | `+ | |  | `+.| |  | |  | |  | |  | |.+' |  | |  | |  | |  | |  | |.+' |  |
     * |  |=|  | |  |  | |  | | |  |      |  |'. '. |  |=|  |      |.+' |  | |  | |  |'. '.    . |  |
     * |  | |  | |  |  | |  | | |  |      |  | |  | |  | |  |    .='    |  | |  | |  | |  | .+'|=|.+'
     * |  | |  | |  |  | |  | | |  |    . |  | |  | |  | |  | .+'|    . |  | |  | |  | |  | |  |    .
     * |  | |  | |  |  | |  | | |  | .+'| |  | |  | |  | |  | |  | .+'| |  | |  | |  | |  | |  | .+'|
     * `+.| |..| `+.|  |.|  |+' `+.|=|.+' `+.| |.+' `+.| |..| |..|=|..| `+.|=|.+' `+.| |.+' `+.|=|.+'
     *
     * }</pre>
     */
    public static final String AMC_RAZOR2 = "amc_razor2";

    /**
     * {@code fonts/amc_slash.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * .s5SSSs.
     * SS. .s5ssSs.  .s5SSSs.  .s5SSSs.  .s        .s5SSSs.  .s5SSSs.  .s    s.
     * sS    S%S    SS SS.       SS.       SS.                 SS.       SS.       SS.
     * SS    S%S sS SS S%S sS    `:; sS    `:; sS        sS    S%S sS    `:; sS    S%S
     * SSSs. S%S SS :; S%S SS        `:;;;;.   SS        SSSs. S%S `:;;;;.   SSSs. S%S
     * SS    S%S SS    S%S SS              ;;. SS        SS    S%S       ;;. SS    S%S
     * SS    `:; SS    `:; SS              `:; SS        SS    `:;       `:; SS    `:;
     * SS    ;,. SS    ;,. SS    ;,. .,;   ;,. SS    ;,. SS    ;,. .,;   ;,. SS    ;,.
     * :;    ;:' :;    ;:' `:;;;;;:' `:;;;;;:' `:;;;;;:' :;    ;:' `:;;;;;:' :;    ;:'
     *
     * }</pre>
     */
    public static final String AMC_SLASH = "amc_slash";

    /**
     * {@code fonts/amc_slider.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ______                                            ____
     * .'.             .'. .`.        .~      ~.             ..'''' |        | |``````.  |            |`````````,
     * .''```.         .'   `   `.     |                    .''       |        | |       | |______      |'''|'''''
     * .'       `.     .'           `.   |                 ..'          |        | |       | |            |    `.
     * .'           `. .'               `.  `.______.' ....''             |_______ | |......'  |___________ |      `.
     *
     * }</pre>
     */
    public static final String AMC_SLIDER = "amc_slider";

    /**
     * {@code fonts/amc_thin.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * .-..-..-. .-.-. .-.-. .-..--. .-..-..-. .-.   .-. .-. .-..-.  .-.
     * | | ~ | | | |~.-.~| | | | ~~   ~ | | ~  | | _ | | | | | | ~.-.| |
     * | |.-.| | | |  ~  | | | |        | |    | |`-'| | | | | |   ~ | |
     * | | ~ | | | |     | | | |        | |    | |   | | | | | |     | |
     * | |   | | | |     | | | | __     | |    | |   | | | | | |     | |
     * `-'   `-' `-'     `-' `-'`--'    `-'    `-'   `-' `-' `-'     `-'
     *
     * }</pre>
     */
    public static final String AMC_THIN = "amc_thin";

    /**
     * {@code fonts/amc_tubes.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * d s.   d s   sb   sSSs. sss sssss d       b d ss.  d sss     sss.
     * S  ~O  S  S S S  S          S     S       S S    b S       d
     * S   `b S   S  S S           S     S       S S    P S       Y
     * S sSSO S      S S           S     S       S S sSS' S sSSs    ss.
     * S    O S      S S           S     S       S S    b S            b
     * S    O S      S  S          S      S     S  S    P S            P
     * P    P P      P   "sss'     P       "sss"   P `SS  P sSSss ` ss'
     *
     * }</pre>
     */
    public static final String AMC_TUBES = "amc_tubes";

    /**
     * {@code fonts/amc_untitled.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ,'',,''',
     * ;  ;',  ;
     * ;  ;,'  ; ,'',,'',,'', ,'',,'', ,',  ,', ,'',,'', ,'',,'',,'', ,'', ,'',,'',,'', ,'',     ,'',,'', ,'',,'',
     * ;  ;',  ; ;  ;', ;', ; ;  ;',,' ; ;  ; ; ;  ;', ; ',,';  ;',,' ;  ; ',,';  ;',,' ;  ;     ;  ;',,' ;  ;;   ;
     * ;  ; ;  ; ;  ; ; ; ; ; ;  ;     ; ;  ; ; ;  ; ; ;     ;  ;     ;  ;     ;  ;     ;  ;     ;  ;',,' ;  ;;   ;
     * ;  ; ;  ; ;  ; ; ; ; ; ;  ;,'', ; ',,' ; ;  ; ; ;     ;  ;     ;  ;     ;  ;     ;  ;,'', ;  ; ,,  ;  ;;   ;
     * ',,' ',,' ',,' ',' ',' ',,'',,' ',,'',,' ',,' ','     ',,'     ',,'     ',,'     ',,'',,' ',,'',,' ',,'',,'
     *
     * }</pre>
     */
    public static final String AMC_UNTITLED = "amc_untitled";

    /**
     * {@code fonts/ansi_regular.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * █████  ███    ██ █████████�            ██████�██████� ██████�██    ██�██      � █████  ██████�
     * ██   █�████   ██� ██    �██�            � ██   █� ██   � ██    �██    ██�█      █�██   █▁ ██   █
     * � █████ ██ ██  █  █████��██        █�█ ████▀�  ████��  ██   █ ██    ██��      ██� █████�█ ████�
     * ��█ ██  █ ██  ████      █▖�███�█  ██ �█   ██  ��█ ██    � ██    █�      ██▖�█ ██  �█  ██ �
     *  ██ ██� ██ ██  � ██ ███� ███    ██ ██    ████��█  ███�  ████�████  ██ ██ � ██ ██
     * �  ██    ████   �████   ��  ��   �   ██   ███   ‖�██     ��█     �     �  ██   �   ██
     * �             �                          ��                  �                    �           ��          �
     * }</pre>
     */
    public static final String ANSI_REGULAR = "ansi_regular";

    /**
     * {@code fonts/ansi_shadow.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * █████╗ ███╗   ██╗█████████�            █████████╗  ██� █████╗ ██████� ██████�██╗    ██╗�
     * ██╔══█�████╗  ██�╗██╔═══�██�            ╗██╔═══�██║  ██�██╔══█▗ ██╔══█� ██╔═══██║    ██║�
     * �╗█████║██╔██╗ █═╝█████��██        █�═╝█████��██████╗█████�█╗██║  █��█╗██║   �█║ █╗ ██�
     * ��█║██╔═█║██║╚████╗╚═══║█▖�███�██╗╚═══�█║██╔═��█║██╔═█║██║  █��█║██║   �██║███╗�
     * ═██║██�╗██║██║ �═██║███�║███╗╚�═██║███═██║██�═██║██�█║████▖�█║╚█████║╚███╔
     * �  ██║╚═╚████║╚═�████║╚═��║╚��═══�████║╚═��  ██║╚═�  ██║╚═╈█╔╝╚══███╔╝ ╚═███╔╝ ╚═�
     * �  ╚═╝        �  ╚═══╝      ═════╝   ═╝  ��═╝    ═════╝   ╝  ╚═╝     �  ╚═╝        ��══╝         ════╝      ��╝╚══╝
     * }</pre>
     */
    public static final String ANSI_SHADOW = "ansi_shadow";

    /**
     * {@code fonts/arrows.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * >>
     * >>=>
     * >> >=>     >> >==> >> >==>    >=>     >=>      >=>  >===>
     * >=>  >=>     >=>     >=>     >=>  >=>   >=>  >  >=> >=>
     * >=====>>=>    >=>     >=>    >=>    >=>  >=> >>  >=>   >==>
     * >=>      >=>   >=>     >=>     >=>  >=>   >=>>  >=>=>     >=>
     * >=>        >=> >==>    >==>       >=>     >==>    >==> >=> >=>
     *
     * }</pre>
     */
    public static final String ARROWS = "arrows";

    /**
     * {@code fonts/ascii_new_roman.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ____,____,____,__, __,  _ _,  _,____,_   _,_ ____, ____, __, _, ____,_,  _,
     * (-/_|(-(__(-/  (-| (-|    (-|\ |(-|_,(-|  |  (-|__)(-/  \(-|\/| (-/_|(-|\ |
     * _/  |,____)_\__,_|_,_|_,   _| \|,_|__,_|/\|,  _|  \,_\__/,_| _|,_/  |,_| \|,
     * (     (    (    (   (      (     (    (       (     (     (     (     (
     * }</pre>
     */
    public static final String ASCII_NEW_ROMAN = "ascii_new_roman";

    /**
     * {@code fonts/avatar.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ____  _     ____  _____  ____  ____
     * /  _ \/ \ |\/  _ \/__ __\/  _ \/  __\
     * | / \|| | //| / \|  / \  | / \||  \/|
     * | |-||| \// | |-||  | |  | |-|||    /
     * \_/ \|\__/  \_/ \|  \_/  \_/ \|\_/\_\
     *
     * }</pre>
     */
    public static final String AVATAR = "avatar";

    /**
     * {@code fonts/b1ff.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * |31FF
     * }</pre>
     */
    public static final String B1FF = "b1ff";

    /**
     * {@code fonts/banner3.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ########     ###    ##    ## ##    ## ######## ########   #######
     * ##     ##   ## ##   ###   ## ###   ## ##       ##     ## ##     ##
     * ##     ##  ##   ##  ####  ## ####  ## ##       ##     ##        ##
     * ########  ##     ## ## ## ## ## ## ## ######   ########   #######
     * ##     ## ######### ##  #### ##  #### ##       ##   ##          ##
     * ##     ## ##     ## ##   ### ##   ### ##       ##    ##  ##     ##
     * ########  ##     ## ##    ## ##    ## ######## ##     ##  #######
     * }</pre>
     */
    public static final String BANNER3 = "banner3";

    /**
     * {@code fonts/banner3_d.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * '########:::::'###::::'##::: ##:'##::: ##:'########:'########:::'#######:::::::::::'########::
     * ##.... ##:::'## ##::: ###:: ##: ###:: ##: ##.....:: ##.... ##:'##.... ##:::::::::: ##.... ##:
     * ##:::: ##::'##:. ##:: ####: ##: ####: ##: ##::::::: ##:::: ##:..::::: ##:::::::::: ##:::: ##:
     * ########::'##:::. ##: ## ## ##: ## ## ##: ######::: ########:::'#######::::::::::: ##:::: ##:
     * ##.... ##: #########: ##. ####: ##. ####: ##...:::: ##.. ##::::...... ##:::::::::: ##:::: ##:
     * ##:::: ##: ##.... ##: ##:. ###: ##:. ###: ##::::::: ##::. ##::'##:::: ##:::::::::: ##:::: ##:
     * ########:: ##:::: ##: ##::. ##: ##::. ##: ########: ##:::. ##:. #######::'#######: ########::
     * ........:::..:::::..::..::::..::..::::..::........::..:::::..:::.......:::.......::........:::
     * }</pre>
     */
    public static final String BANNER3_D = "banner3_d";

    /**
     * {@code fonts/banner4.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * .########.....###....##....##.##....##.########.########..##.......
     * .##.....##...##.##...###...##.###...##.##.......##.....##.##....##.
     * .##.....##..##...##..####..##.####..##.##.......##.....##.##....##.
     * .########..##.....##.##.##.##.##.##.##.######...########..##....##.
     * .##.....##.#########.##..####.##..####.##.......##...##...#########
     * .##.....##.##.....##.##...###.##...###.##.......##....##........##.
     * .########..##.....##.##....##.##....##.########.##.....##.......##.
     * }</pre>
     */
    public static final String BANNER4 = "banner4";

    /**
     * {@code fonts/barbwire.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ><< ><<                    ><<
     * ><    ><<                  ><<                   ><
     * ><     ><<   ><<    >< ><<<><<      ><<     ><<<   >< ><<<   ><<
     * ><<< ><    ><<  ><<  ><<   ><< ><<   ><<  <  ><<><< ><<    ><   ><<
     * ><     ><<><<   ><<  ><<   ><<   ><< ><< ><  ><<><< ><<   ><<<<< ><<
     * ><      ><><<   ><<  ><<   ><<   ><< >< >< ><><<><< ><<   ><
     * ><<<< ><<   ><< ><<<><<<   ><< ><<  ><<<    ><<<><<><<<     ><<<<
     *
     * }</pre>
     */
    public static final String BARBWIRE = "barbwire";

    /**
     * {@code fonts/basic.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * d8888b.  .d8b.  .d8888. d888888b  .o88b.
     * 88  `8D d8' `8b 88'  YP   `88'   d8P  Y8
     * 88oooY' 88ooo88 `8bo.      88    8P
     * 88~~~b. 88~~~88   `Y8b.    88    8b
     * 88   8D 88   88 db   8D   .88.   Y8b  d8
     * Y8888P' YP   YP `8888Y' Y888888P  `Y88P'
     *
     *
     * }</pre>
     */
    public static final String BASIC = "basic";

    /**
     * {@code fonts/bear.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * _     _      _     _      _     _      _     _
     * (c).-.(c)    (c).-.(c)    (c).-.(c)    (c).-.(c)
     * / ._. \      / ._. \      / ._. \      / ._. \
     * __\( Y )/__  __\( Y )/__  __\( Y )/__  __\( Y )/__
     * (_.-/'-'\-._)(_.-/'-'\-._)(_.-/'-'\-._)(_.-/'-'\-._)
     * || B ||      || E ||      || A ||      || R ||
     * _.' `-' '._  _.' `-' '._  _.' `-' '._  _.' `-' '._
     * (.-./`-'\.-.)(.-./`-'\.-.)(.-./`-'\.-.)(.-./`-`\.-.)
     * `-'     `-'  `-'     `-'  `-'     `-'  `-'     `-'
     * }</pre>
     */
    public static final String BEAR = "bear";

    /**
     * {@code fonts/bell.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ____           .    .
     * /   \    ___   |    |
     * |,_-<  .'   `  |    |
     * |    ` |----'  |    |
     * `----' `.___, /\__ /\__
     *
     * }</pre>
     */
    public static final String BELL = "bell";

    /**
     * {@code fonts/benjamin.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * |3[-|\|.]/-\|\/|||\|
     * }</pre>
     */
    public static final String BENJAMIN = "benjamin";


    /**
     * {@code fonts/bigchief.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ________________________________________________________
     * ____                                              _
     * /   )     ,                  /      ,           /  `
     * ---/__ /-----------__-----__----/__----------__---_/__--
     * /    )    /    /   )  /   '  /   )  /    /___)  /
     * _/____/____/____(___/__(___ __/___/__/____(___ __/______
     * /
     * (_ /
     * }</pre>
     */
    public static final String BIGCHIEF = "bigchief";

    /**
     * {@code fonts/bigfig.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * _     _   _    _
     * |_) o (_|_|_ o (_|
     * |_) | __| |  | __|
     * }</pre>
     */
    public static final String BIGFIG = "bigfig";

    /**
     * {@code fonts/big_chief.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ______________________________________________________________
     * ____                                                    _
     * /   )     ,                        /      ,           /  `
     * ---/__ /-----------__-----------__----/__----------__---_/__--
     * /    )    /    /   )        /   '  /   )  /    /___)  /
     * _/____/____/____(___/________(___ __/___/__/____(___ __/______
     * /  ------
     * (_ /
     * }</pre>
     */
    public static final String BIG_CHIEF = "big_chief";

    /**
     * {@code fonts/big_money_ne.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * /$$$$$$$  /$$
     * | $$__  $$|__/
     * | $$  \ $$ /$$  /$$$$$$          /$$$$$$/$$$$   /$$$$$$  /$$$$$$$   /$$$$$$  /$$   /$$         /$$$$$$$   /$$$$$$
     * | $$$$$$$ | $$ /$$__  $$        | $$_  $$_  $$ /$$__  $$| $$__  $$ /$$__  $$| $$  | $$        | $$__  $$ /$$__  $$
     * | $$__  $$| $$| $$  \ $$        | $$ \ $$ \ $$| $$  \ $$| $$  \ $$| $$$$$$$$| $$  | $$        | $$  \ $$| $$$$$$$$
     * | $$  \ $$| $$| $$  | $$        | $$ | $$ | $$| $$  | $$| $$  | $$| $$_____/| $$  | $$        | $$  | $$| $$_____/
     * | $$$$$$$/| $$|  $$$$$$$        | $$ | $$ | $$|  $$$$$$/| $$  | $$|  $$$$$$$|  $$$$$$$        | $$  | $$|  $$$$$$$
     * |_______/ |__/ \____  $$ /$$$$$$|__/ |__/ |__/ \______/ |__/  |__/ \_______/ \____  $$ /$$$$$$|__/  |__/ \_______/
     * /$$  \ $$|______/                                             /$$  | $$|______/
     * |  $$$$$$/                                                    |  $$$$$$/
     * \______/                                                      \______/
     * }</pre>
     */
    public static final String BIG_MONEY_NE = "big_money_ne";

    /**
     * {@code fonts/big_money_nw.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * $$$$$$$\  $$\
     * $$  __$$\ \__|
     * $$ |  $$ |$$\  $$$$$$\         $$$$$$\$$$$\   $$$$$$\  $$$$$$$\   $$$$$$\  $$\   $$\        $$$$$$$\  $$\  $$\  $$\
     * $$$$$$$\ |$$ |$$  __$$\        $$  _$$  _$$\ $$  __$$\ $$  __$$\ $$  __$$\ $$ |  $$ |       $$  __$$\ $$ | $$ | $$ |
     * $$  __$$\ $$ |$$ /  $$ |       $$ / $$ / $$ |$$ /  $$ |$$ |  $$ |$$$$$$$$ |$$ |  $$ |       $$ |  $$ |$$ | $$ | $$ |
     * $$ |  $$ |$$ |$$ |  $$ |       $$ | $$ | $$ |$$ |  $$ |$$ |  $$ |$$   ____|$$ |  $$ |       $$ |  $$ |$$ | $$ | $$ |
     * $$$$$$$  |$$ |\$$$$$$$ |       $$ | $$ | $$ |\$$$$$$  |$$ |  $$ |\$$$$$$$\ \$$$$$$$ |       $$ |  $$ |\$$$$$\$$$$  |
     * \_______/ \__| \____$$ |$$$$$$\\__| \__| \__| \______/ \__|  \__| \_______| \____$$ |$$$$$$\\__|  \__| \_____\____/
     * $$\   $$ |\______|                                           $$\   $$ |\______|
     * \$$$$$$  |                                                   \$$$$$$  |
     * \______/                                                     \______/
     * }</pre>
     */
    public static final String BIG_MONEY_NW = "big_money_nw";

    /**
     * {@code fonts/big_money_se.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * _______   __
     * |       \ |  \
     * | $$$$$$$\ \$$  ______          ______ ____    ______   _______    ______   __    __          _______   ______
     * | $$__/ $$|  \ /      \        |      \    \  /      \ |       \  /      \ |  \  |  \        /       \ /      \
     * | $$    $$| $$|  $$$$$$\       | $$$$$$\$$$$\|  $$$$$$\| $$$$$$$\|  $$$$$$\| $$  | $$       |  $$$$$$$|  $$$$$$\
     * | $$$$$$$\| $$| $$  | $$       | $$ | $$ | $$| $$  | $$| $$  | $$| $$    $$| $$  | $$        \$$    \ | $$    $$
     * | $$__/ $$| $$| $$__| $$       | $$ | $$ | $$| $$__/ $$| $$  | $$| $$$$$$$$| $$__/ $$        _\$$$$$$\| $$$$$$$$
     * | $$    $$| $$ \$$    $$ ______| $$ | $$ | $$ \$$    $$| $$  | $$ \$$     \ \$$    $$ ______|       $$ \$$     \
     * \$$$$$$$  \$$ _\$$$$$$$|      \\$$  \$$  \$$  \$$$$$$  \$$   \$$  \$$$$$$$ _\$$$$$$$|      \\$$$$$$$   \$$$$$$$
     * |  \__| $$ \$$$$$$                                           |  \__| $$ \$$$$$$
     * \$$    $$                                                    \$$    $$
     * \$$$$$$                                                      \$$$$$$
     * }</pre>
     */
    public static final String BIG_MONEY_SE = "big_money_se";

    /**
     * {@code fonts/big_money_sw.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * _______   __
     * /       \ /  |
     * $$$$$$$  |$$/   ______           _____  ____    ______   _______    ______   __    __           _______  __   __   __
     * $$ |__$$ |/  | /      \         /     \/    \  /      \ /       \  /      \ /  |  /  |         /       |/  | /  | /  |
     * $$    $$< $$ |/$$$$$$  |        $$$$$$ $$$$  |/$$$$$$  |$$$$$$$  |/$$$$$$  |$$ |  $$ |        /$$$$$$$/ $$ | $$ | $$ |
     * $$$$$$$  |$$ |$$ |  $$ |        $$ | $$ | $$ |$$ |  $$ |$$ |  $$ |$$    $$ |$$ |  $$ |        $$      \ $$ | $$ | $$ |
     * $$ |__$$ |$$ |$$ \__$$ |        $$ | $$ | $$ |$$ \__$$ |$$ |  $$ |$$$$$$$$/ $$ \__$$ |         $$$$$$  |$$ \_$$ \_$$ |
     * $$    $$/ $$ |$$    $$ | ______ $$ | $$ | $$ |$$    $$/ $$ |  $$ |$$       |$$    $$ | ______ /     $$/ $$   $$   $$/
     * $$$$$$$/  $$/  $$$$$$$ |/      |$$/  $$/  $$/  $$$$$$/  $$/   $$/  $$$$$$$/  $$$$$$$ |/      |$$$$$$$/   $$$$$/$$$$/
     * /  \__$$ |$$$$$$/                                             /  \__$$ |$$$$$$/
     * $$    $$/                                                     $$    $$/
     * $$$$$$/                                                       $$$$$$/
     * }</pre>
     */
    public static final String BIG_MONEY_SW = "big_money_sw";

    /**
     * {@code fonts/binary.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * 01000010 01101001 01101110 01100001 01110010 01111001
     * }</pre>
     */
    public static final String BINARY = "binary";

    /**
     * {@code fonts/blocks.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * .----------------.  .----------------.  .----------------.  .----------------.  .----------------.  .----------------.
     * | .--------------. || .--------------. || .--------------. || .--------------. || .--------------. || .--------------. |
     * | |   ______     | || |   _____      | || |     ____     | || |     ______   | || |  ___  ____   | || |    _______   | |
     * | |  |_   _ \    | || |  |_   _|     | || |   .'    `.   | || |   .' ___  |  | || | |_  ||_  _|  | || |   /  ___  |  | |
     * | |    | |_) |   | || |    | |       | || |  /  .--.  \  | || |  / .'   \_|  | || |   | |_/ /    | || |  |  (__ \_|  | |
     * | |    |  __'.   | || |    | |   _   | || |  | |    | |  | || |  | |         | || |   |  __'.    | || |   '.___`-.   | |
     * | |   _| |__) |  | || |   _| |__/ |  | || |  \  `--'  /  | || |  \ `.___.'\  | || |  _| |  \ \_  | || |  |`\____) |  | |
     * | |  |_______/   | || |  |________|  | || |   `.____.'   | || |   `._____.'  | || | |____||____| | || |  |_______.'  | |
     * | |              | || |              | || |              | || |              | || |              | || |              | |
     * | '--------------' || '--------------' || '--------------' || '--------------' || '--------------' || '--------------' |
     * '----------------'  '----------------'  '----------------'  '----------------'  '----------------'  '----------------'
     * }</pre>
     */
    public static final String BLOCKS = "blocks";

    /**
     * {@code fonts/bloody.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ▄▄▄▄   � ██▓    � ▒█████ ▒█████▓████�▓██   ██
     * ��█████��██▒      ▒██▒  █  ▒██▒  █��▄ ▒██�▓ ▒██  █
     * ▄ ▒██▒ ▒██░   █▒▒██░ █▒▒██░ �� ██▌░�█▒  ▒██
     * ▄██▒█� ▒██░   ██▒▒██ ██▒▒██��█   █▌�██░  ░ ▐
     * �░█▀  ░�  ░███�   ██░░ █   ██░░ █�▓█▄   ▌██▓░  ░
     * �█  ▀█▓▖�██▒░ ███▓▒░�███▓▒░�░▒███�██▒▓░
     * �▒▓███�▒░▓  ░░ ▒░▒░▒░ ▒░▒░▒█▓  ▒▒▓██▒▒▒  �
     * ��▒▒░▒   �� ░ ▒  ░��   ░ ▒ ▒░��   ░ ▒ ▒░  ▒  ░ ▒  ��██ ░▒░
     * ░  ░    ░    ░ ░       ░ ░ ░ ▒    ░ ░ ░ ▒   ▒  ░ ░  �  ▒ ▒ ░░
     * ░            � ░  ░         ░ ░            ░ ░         �    ░     ░ ░ ░      ░
     * }</pre>
     */
    public static final String BLOODY = "bloody";

    /**
     * {@code fonts/bolger.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * 888~~\           888       /
     * 888   |  e88~-_  888 e88~88e  e88~~8e  888-~\
     * 888 _/  d888   i 888 888 888 d888  88b 888
     * 888  \  8888   | 888 "88_88" 8888__888 888
     * 888   | Y888   ' 888  /      Y888    , 888
     * 888__/   "88_-~  888 Cb       "88___/  888
     * Y8""8D
     * }</pre>
     */
    public static final String BOLGER = "bolger";

    /**
     * {@code fonts/braced.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * .----. .---.  .--.  .----..----..----.
     * | {_} }} }}_}/ {} \ | }`-'} |__}} {-. \
     * | {_} }| } \/  /\  \| },-.} '__}} '-} /
     * `----' `-'-'`-'  `-'`----'`----'`----'
     *
     * }</pre>
     */
    public static final String BRACED = "braced";

    /**
     * {@code fonts/bright.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * .#####...#####...######...####...##..##..######.
     * .##..##..##..##....##....##......##..##....##...
     * .#####...#####.....##....##.###..######....##...
     * .##..##..##..##....##....##..##..##..##....##...
     * .#####...##..##..######...####...##..##....##...
     * ................................................
     * }</pre>
     */
    public static final String BRIGHT = "bright";

    /**
     * {@code fonts/broadway.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     *
     * 8 888888888o   8 888888888o.       ,o888888o.              .8.          8 888888888o.      `8.`888b                 ,8'          .8.          `8.`8888.      ,8'
     * 8 8888    `88. 8 8888    `88.   . 8888     `88.           .888.         8 8888    `^888.    `8.`888b               ,8'          .888.          `8.`8888.    ,8'
     * 8 8888     `88 8 8888     `88  ,8 8888       `8b         :88888.        8 8888        `88.   `8.`888b             ,8'          :88888.          `8.`8888.  ,8'
     * 8 8888     ,88 8 8888     ,88  88 8888        `8b       . `88888.       8 8888         `88    `8.`888b     .b    ,8'          . `88888.          `8.`8888.,8'
     * 8 8888.   ,88' 8 8888.   ,88'  88 8888         88      .8. `88888.      8 8888          88     `8.`888b    88b  ,8'          .8. `88888.          `8.`88888'
     * 8 8888888888   8 888888888P'   88 8888         88     .8`8. `88888.     8 8888          88      `8.`888b .`888b,8'          .8`8. `88888.          `8. 8888
     * 8 8888    `88. 8 8888`8b       88 8888        ,8P    .8' `8. `88888.    8 8888         ,88       `8.`888b8.`8888'          .8' `8. `88888.          `8 8888
     * 8 8888      88 8 8888 `8b.     `8 8888       ,8P    .8'   `8. `88888.   8 8888        ,88'        `8.`888`8.`88'          .8'   `8. `88888.          8 8888
     * 8 8888    ,88' 8 8888   `8b.    ` 8888     ,88'    .888888888. `88888.  8 8888    ,o88P'           `8.`8' `8,`'          .888888888. `88888.         8 8888
     * 8 888888888P   8 8888     `88.     `8888888P'     .8'       `8. `88888. 8 888888888P'               `8.`   `8'          .8'       `8. `88888.        8 8888
     * }</pre>
     */
    public static final String BROADWAY = "broadway";

    /**
     * {@code fonts/broadway_kb.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ___   ___   ___    __    ___   _        __    _           _     ___
     * | |_) | |_) / / \  / /\  | | \ \ \    / / /\  \ \_/  ___  | |_/ | |_)
     * |_|_) |_| \ \_\_/ /_/--\ |_|_/  \_\/\/ /_/--\  |_|  |___| |_| \ |_|_)
     * }</pre>
     */
    public static final String BROADWAY_KB = "broadway_kb";

    /**
     * {@code fonts/bulbhead.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ____  __  __  __    ____  _   _  ____    __    ____
     * (  _ \(  )(  )(  )  (  _ \( )_( )( ___)  /__\  (  _ \
     * ) _ < )(__)(  )(__  ) _ < ) _ (  )__)  /(__)\  )(_) )
     * (____/(______)(____)(____/(_) (_)(____)(__)(__)(____/
     * }</pre>
     */
    public static final String BULBHEAD = "bulbhead";

    /**
     * {@code fonts/calgphy2.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     *
     * # ###            ###                              /
     * /  /###  /          ###                           #/
     * /  /  ###/            ##                           ##
     * /  ##   ##             ##                           ##
     * /  ###                  ##                           ##
     * ##   ##          /###    ##      /###         /###    ##  /##  ##   ####
     * ##   ##         / ###  / ##     /  ###  /    / ###  / ## / ###  ##    ###  /
     * ##   ##        /   ###/  ##    /    ###/    /   ###/  ##/   ### ##     ###/
     * ##   ##       ##    ##   ##   ##     ##    ##    ##   ##     ## ##      ##
     * ##   ##       ##    ##   ##   ##     ##    ##    ##   ##     ## ##      ##
     * ##  ##       ##    ##   ##   ##     ##    ##    ##   ##     ## ##      ##
     * ## #      / ##    ##   ##   ##     ##    ##    ##   ##     ## ##      ##
     * ###     /  ##    /#   ##   ##     ##    ##    ##   ##     ## ##      ##    n
     * ######/    ####/ ##  ### / ########    #######    ##     ##  #########    u
     * ###       ###   ##  ##/    ### ###   ######      ##    ##    #### ###   m
     * ###  ##                /           ###  b
     * ####   ### ##               /     #####   ### e
     * /######  /#  ##              /    /#######  /#  r
     * /     ###/     ##            /    /      ###/    2
     * }</pre>
     */
    public static final String CALGPHY2 = "calgphy2";

    /**
     * {@code fonts/caligraphy.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     *
     * ***               ***                                                                *
     *  ****  *             ***      *                                                      **
     *  *  ****               **     ***                                                     **
     *  **   **                **      *                                                      **
     *  ***                     **                          ***  ****                  ****    **        **   ****
     * *   **           ****      **    ***         ****       **** **** *    ****      * ***  * **  ***    **    ***  *
     * *   **          * ***  *   **     ***       *  ***  *    **   ****    * ***  *  *   ****  ** * ***   **     ****
     * *   **         *   ****    **      **      *    ****     **          *   ****  **    **   ***   ***  **      **
     * *   **        **    **     **      **     **     **      **         **    **   **    **   **     **  **      **
     * *   **        **    **     **      **     **     **      **         **    **   **    **   **     **  **      **
     * *  **        **    **     **      **     **     **      **         **    **   **    **   **     **  **      **
     * * *      *  **    **     **      **     **     **      **         **    **   **    **   **     **  **      **
     * **     *   **    **     **      **     **     **      ***        **    **   *******    **     **   *********
     * ******     ***** **    *** *   *** *   ********       ***        ***** **  ******     **     **     **** ***
     * **        ***   **    ***     ***      *** ***                  ***   ** **          **    **           ***
     * **                          **                *     *****   ***
     * ***   ***                         **               *    ********  **
     * ******  **                           **             *    *      ****
     *     ****                                           *
     *
     * }</pre>
     */
    public static final String CALIGRAPHY = "caligraphy";

    /**
     * {@code fonts/caligraphy2.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     *
     * # ###            ###                                                        /
     * /  /###  /          ###    #                                                #/
     * /  /  ###/            ##   ###                                               ##
     * /  ##   ##             ##    #                                                ##
     * /  ###                  ##                                                     ##
     * ##   ##          /###    ##  ###       /###    ###  /###     /###       /###    ##  /##  ##   ####
     * ##   ##         / ###  / ##   ###     /  ###  / ###/ #### / / ###  /   / ###  / ## / ###  ##    ###  /
     * ##   ##        /   ###/  ##    ##    /    ###/   ##   ###/ /   ###/   /   ###/  ##/   ### ##     ###/
     * ##   ##       ##    ##   ##    ##   ##     ##    ##       ##    ##   ##    ##   ##     ## ##      ##
     * ##   ##       ##    ##   ##    ##   ##     ##    ##       ##    ##   ##    ##   ##     ## ##      ##
     * ##  ##       ##    ##   ##    ##   ##     ##    ##       ##    ##   ##    ##   ##     ## ##      ##
     * ## #      / ##    ##   ##    ##   ##     ##    ##       ##    ##   ##    ##   ##     ## ##      ##
     * ###     /  ##    /#   ##    ##   ##     ##    ##       ##    /#   ##    ##   ##     ## ##      ##    n
     * ######/    ####/ ##  ### / ### / ########    ###       ####/ ##  #######    ##     ##  #########    u
     * ###       ###   ##  ##/   ##/    ### ###    ###       ###   ## ######      ##    ##    #### ###   m
     * ###                      ##                /           ###  b
     * ####   ###                     ##               /     #####   ### e
     * /######  /#                      ##              /    /#######  /#  r
     * /     ###/                         ##            /    /      ###/    2
     * }</pre>
     */
    public static final String CALIGRAPHY2 = "caligraphy2";

    /**
     * {@code fonts/calvin_s.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ╔═�┌─�┬  �┬  ┬�┬┌┐┌      ┌─┐
     * ��║  �├─│  └�┐┌�││││  ─�└─┐
     * ╚═┤┴ ┴─└? └�?┴�?└�?��─�└─�?
     * }</pre>
     */
    public static final String CALVIN_S = "calvin_s";

    /**
     * {@code fonts/cards.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * .------..------..------..------..------.
     * |C.--. ||A.--. ||R.--. ||D.--. ||S.--. |
     * | :/\: || (\/) || :(): || :/\: || :/\: |
     * | :\/: || :\/: || ()() || (__) || :\/: |
     * | '--'C|| '--'A|| '--'R|| '--'D|| '--'S|
     * `------'`------'`------'`------'`------'
     * }</pre>
     */
    public static final String CARDS = "cards";

    /**
     * {@code fonts/catwalk.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * _//               _//                         _//_//
     * _//   _//            _//                         _//_//
     * _//          _//    _/_/ _/_//     _///   _//     _//_//  _//
     * _//        _//  _//   _//   _//  /  _// _//  _//  _//_// _//
     * _//       _//   _//   _//   _// _/  _//_//   _//  _//_/_//
     * _//   _//_//   _//   _//   _/ _/ _/_//_//   _//  _//_// _//
     * _////    _// _///   _// _///    _///  _// _///_///_//  _//
     *
     * }</pre>
     */
    public static final String CATWALK = "catwalk";

    /**
     * {@code fonts/chiseled.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * _,.----.  ,--.-,,-,--, .=-.-.  ,-,--.     ,----.                ,----.
     * .' .' -   \/==/  /|=|  |/==/_ /,-.'-  _\ ,-.--` , \   _.-.     ,-.--` , \  _,..---._
     * /==/  ,  ,-'|==|_ ||=|, |==|, |/==/_ ,_.'|==|-  _.-` .-,.'|    |==|-  _.-`/==/,   -  \
     * |==|-   |  .|==| ,|/=| _|==|  |\==\  \   |==|   `.-.|==|, |    |==|   `.-.|==|   _   _\
     * |==|_   `-' \==|- `-' _ |==|- | \==\ -\ /==/_ ,    /|==|- |   /==/_ ,    /|==|  .=.   |
     * |==|   _  , |==|  _     |==| ,| _\==\ ,\|==|    .-' |==|, |   |==|    .-' |==|,|   | -|
     * \==\.       /==|   .-. ,\==|- |/==/\/ _ |==|_  ,`-._|==|- `-._|==|_  ,`-._|==|  '='   /
     * `-.`.___.-'/==/, //=/  /==/. /\==\ - , /==/ ,     //==/ - , ,/==/ ,     /|==|-,   _`/
     * `--`-' `-`--`--`-`  `--`---'`--`-----`` `--`-----'`--`-----`` `-.`.____.'
     * }</pre>
     */
    public static final String CHISELED = "chiseled";

    /**
     * {@code fonts/chunky.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ______  __                   __
     * |      ||  |--..--.--..-----.|  |--..--.--.
     * |   ---||     ||  |  ||     ||    < |  |  |
     * |______||__|__||_____||__|__||__|__||___  |
     * |_____|
     * }</pre>
     */
    public static final String CHUNKY = "chunky";

    /**
     * {@code fonts/coinstak.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * O))                                  O))            O))
     * O))   O))           O)                  O))            O))
     * O))          O))       O)) O))   O)))) O)O) O)   O))    O))  O))
     * O))        O))  O)) O)) O))  O))O))      O))   O))  O)) O)) O))
     * O))       O))    O))O)) O))  O))  O)))   O))  O))   O)) O)O))
     * O))   O)) O))  O)) O)) O))  O))    O))  O))  O))   O)) O)) O))
     * O))))     O))    O))O)))  O))O)) O))   O))   O)) O)))O))  O))
     *
     * }</pre>
     */
    public static final String COINSTAK = "coinstak";

    /**
     * {@code fonts/cola.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * .-._   .-._.  .;
     * .: (_)`-'      .;'
     * ::      .-.   .;  .-.
     * ::   _ ;   ;'::  ;   :
     * `: .; )`;;'_;;_.-`:::'-'
     * `--'
     * }</pre>
     */
    public static final String COLA = "cola";

    /**
     * {@code fonts/colossal.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * .d8888b.           888                                     888
     * d88P  Y88b          888                                     888
     * 888    888          888                                     888
     * 888         .d88b.  888  .d88b.  .d8888b  .d8888b   8888b.  888
     * 888        d88""88b 888 d88""88b 88K      88K          "88b 888
     * 888    888 888  888 888 888  888 "Y8888b. "Y8888b. .d888888 888
     * Y88b  d88P Y88..88P 888 Y88..88P      X88      X88 888  888 888
     * "Y8888P"   "Y88P"  888  "Y88P"   88888P'  88888P' "Y888888 888
     *
     *
     *
     * }</pre>
     */
    public static final String COLOSSAL = "colossal";

    /**
     * {@code fonts/computer.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * 8""""8
     * 8    " eeeee eeeeeee eeeee e   e eeeee eeee eeeee
     * 8e     8  88 8  8  8 8   8 8   8   8   8    8   8
     * 88     8   8 8e 8  8 8eee8 8e  8   8e  8eee 8eee8e
     * 88   e 8   8 88 8  8 88    88  8   88  88   88   8
     * 88eee8 8eee8 88 8  8 88    88ee8   88  88ee 88   8
     *
     * }</pre>
     */
    public static final String COMPUTER = "computer";

    /**
     * {@code fonts/contessa.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * __        ,
     * /  ` _ ._ -+- _  __ __ _.
     * \__.(_)[ ) | (/,_) _) (_]
     *
     * }</pre>
     */
    public static final String CONTESSA = "contessa";

    /**
     * {@code fonts/contrast.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ..%%%%....%%%%...%%..%%..%%%%%%..%%%%%....%%%%....%%%%...%%%%%%.
     * .%%..%%..%%..%%..%%%.%%....%%....%%..%%..%%..%%..%%........%%...
     * .%%......%%..%%..%%.%%%....%%....%%%%%...%%%%%%...%%%%.....%%...
     * .%%..%%..%%..%%..%%..%%....%%....%%..%%..%%..%%......%%....%%...
     * ..%%%%....%%%%...%%..%%....%%....%%..%%..%%..%%...%%%%.....%%...
     * ................................................................
     * }</pre>
     */
    public static final String CONTRAST = "contrast";

    /**
     * {@code fonts/cosmic.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * .,-:::::     ...      .::::::. .        :   :::  .,-:::::
     * ,;;;'````'  .;;;;;;;.  ;;;`    ` ;;,.    ;;;  ;;;,;;;'````'
     * [[[        ,[[     \[[,'[==/[[[[,[[[[, ,[[[[, [[[[[[
     * $$$        $$$,     $$$  '''    $$$$$$$$$"$$$ $$$$$$
     * `88bo,__,o,"888,_ _,88P 88b    dP888 Y88" 888o888`88bo,__,o,
     * "YUMMMMMP" "YMMMMMP"   "YMmMY" MMM  M'  "MMMMMM  "YUMMMMMP"
     * }</pre>
     */
    public static final String COSMIC = "cosmic";

    /**
     * {@code fonts/cosmike.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * .,-:::::     ...      .::::::. .        :   ::: :::  .   .,::::::
     * ,;;;'````'  .;;;;;;;.  ;;;`    ` ;;,.    ;;;  ;;; ;;; .;;,.;;;;''''
     * [[[        ,[[     \[[,'[==/[[[[,[[[[, ,[[[[, [[[ [[[[[/'   [[cccc
     * $$$        $$$,     $$$  '''    $$$$$$$$$"$$$ $$$_$$$$,     $$""""
     * `88bo,__,o,"888,_ _,88P 88b    dP888 Y88" 888o888"888"88o,  888oo,__
     * "YUMMMMMP" "YMMMMMP"   "YMmMY" MMM  M'  "MMMMMM MMM "MMP" """"YUMMM
     * }</pre>
     */
    public static final String COSMIKE = "cosmike";

    /**
     * {@code fonts/crawford.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * __  ____    ____  __    __  _____   ___   ____   ___
     * /  ]|    \  /    T|  T__T  T|     | /   \ |    \ |   \
     * /  / |  D  )Y  o  ||  |  |  ||   __jY     Y|  D  )|    \
     * /  /  |    / |     ||  |  |  ||  l_  |  O  ||    / |  D  Y
     * /   \_ |    \ |  _  |l  `  '  !|   _] |     ||    \ |     |
     * \     ||  .  Y|  |  | \      / |  T   l     !|  .  Y|     |
     * \____jl__j\_jl__j__j  \_/\_/  l__j    \___/ l__j\_jl_____j
     *
     * }</pre>
     */
    public static final String CRAWFORD = "crawford";

    /**
     * {@code fonts/crawford2.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * __  ____    ____  __    __  _____   ___   ____   ___
     * /  ]|    \  /    ||  |__|  ||     | /   \ |    \ |   \
     * /  / |  D  )|  o  ||  |  |  ||   __||     ||  D  )|    \
     * /  /  |    / |     ||  |  |  ||  |_  |  O  ||    / |  D  |
     * /   \_ |    \ |  _  ||  `  '  ||   _] |     ||    \ |     |
     * \     ||  .  \|  |  | \      / |  |   |     ||  .  \|     |
     * \____||__|\_||__|__|  \_/\_/  |__|    \___/ |__|\_||_____|
     *
     * }</pre>
     */
    public static final String CRAWFORD2 = "crawford2";

    /**
     * {@code fonts/crazy.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * _..._
     * .-'_..._''.
     * .' .'      '.\
     * / .'                                      .-.          .-
     * . '             .-,.--.                     \ \        / /
     * | |             |  .-. |    __               \ \      / /
     * | |             | |  | | .:--.'.  .--------.  \ \    / /
     * . '             | |  | |/ |   \ | |____    |   \ \  / /
     * \ '.          .| |  '- `" __ | |     /   /     \ `  /
     * '. `._____.-'/| |      .'.''| |   .'   /       \  /
     * `-.______ / | |     / /   | |_ /    /___     / /
     * `  |_|     \ \._,\ '/|         ||`-' /
     * `--'  `" |_________| '..'
     * }</pre>
     */
    public static final String CRAZY = "crazy";

    /**
     * {@code fonts/cricket.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * _______      __      __          __
     * |   _   .----|__.----|  |--.-----|  |_
     * |.  1___|   _|  |  __|    <|  -__|   _|
     * |.  |___|__| |__|____|__|__|_____|____|
     * |:  1   |
     * |::.. . |
     * `-------'
     *
     * }</pre>
     */
    public static final String CRICKET = "cricket";

    /**
     * {@code fonts/cursive.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * __
     * /  )
     * /   . . __  _   o, __
     * (__/(_/_/ (_/_)_<_\/</_
     *
     *
     * }</pre>
     */
    public static final String CURSIVE = "cursive";

    /**
     * {@code fonts/cyberlarge.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * _______ __   __ ______  _______  ______        _______  ______  ______ _______
     * |         \_/   |_____] |______ |_____/ |      |_____| |_____/ |  ____ |______
     * |_____     |    |_____] |______ |    \_ |_____ |     | |    \_ |_____| |______
     *
     * }</pre>
     */
    public static final String CYBERLARGE = "cyberlarge";

    /**
     * {@code fonts/cybermedium.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ____ _   _ ___  ____ ____ _  _ ____ ___  _ _  _ _  _
     * |     \_/  |__] |___ |__/ |\/| |___ |  \ | |  | |\/|
     * |___   |   |__] |___ |  \ |  | |___ |__/ | |__| |  |
     *
     * }</pre>
     */
    public static final String CYBERMEDIUM = "cybermedium";

    /**
     * {@code fonts/cybersmall.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ____ _ _ ___  ____ ____ ____ _  _ ____ _    _
     * |___  Y  |==] |=== |--< ==== |\/| |--| |___ |___
     * }</pre>
     */
    public static final String CYBERSMALL = "cybersmall";

    /**
     * {@code fonts/cygnet.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     *
     * .-             .
     * (  . ..-..-..-,-|-
     * `-'-|`-|' '`'- '-
     * `-'`-'
     * }</pre>
     */
    public static final String CYGNET = "cygnet";

    /**
     * {@code fonts/danc4.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * '\   /`  \O/    O/  \O    O
     * \ /     Y_   <|    |    |\
     * Y     /  |  / \  / \  / \
     * O\# ./   |__| |__\ /__\ /_
     * }</pre>
     */
    public static final String DANC4 = "danc4";

    /**
     * {@code fonts/dancingfont.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ____       _      _   _      ____              _   _     ____    _____   U  ___ u  _   _     _____
     * |  _"\  U  /"\  u | \ |"|  U /"___|    ___     | \ |"| U /"___|u |" ___|   \/"_ \/ | \ |"|   |_ " _|
     * /| | | |  \/ _ \/ <|  \| |> \| | u     |_"_|   <|  \| |>\| |  _ /U| |_  u   | | | |<|  \| |>    | |
     * U| |_| |\ / ___ \ U| |\  |u  | |/__     | |    U| |\  |u | |_| | \|  _|/.-,_| |_| |U| |\  |u   /| |\
     * |____/ u/_/   \_\ |_| \_|    \____|  U/| |\\u   |_| \_|   \____|  |_|    \_)-\___/  |_| \_|   u |_|U
     * |||_    \\    >> ||   \\,-._// \\.-,_|___|_,-.||   \\,-._)(|_   )(\\,-      \\    ||   \\,-._// \\_
     * (__)_)  (__)  (__)(_")  (_/(__)(__)\_)-' '-(_/ (_")  (_/(__)__) (__)(_/     (__)   (_")  (_/(__) (__)
     * }</pre>
     */
    public static final String DANCINGFONT = "dancingfont";

    /**
     * {@code fonts/dancing_font.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ____       _      _   _      ____              _   _     ____   _  _____   U  ___ u  _   _     _____
     * |  _"\  U  /"\  u | \ |"|  U /"___|    ___     | \ |"| U /"___|u   |" ___|   \/"_ \/ | \ |"|   |_ " _|
     * /| | | |  \/ _ \/ <|  \| |> \| | u     |_"_|   <|  \| |>\| |  _ /  U| |_  u   | | | |<|  \| |>    | |
     * U| |_| |\ / ___ \ U| |\  |u  | |/__     | |    U| |\  |u | |_| |   \|  _|/.-,_| |_| |U| |\  |u   /| |\
     * |____/ u/_/   \_\ |_| \_|    \____|  U/| |\\u   |_| \_|   \____|    |_|    \_)-\___/  |_| \_|   u |_|U
     * |||_    \\    >> ||   \\,-._// \\.-,_|___|_,-.||   \\,-._)(|_     )(\\,-      \\    ||   \\,-._// \\_
     * (__)_)  (__)  (__)(_")  (_/(__)(__)\_)-' '-(_/ (_")  (_/(__)__)   (__)(_/     (__)   (_")  (_/(__) (__)
     * }</pre>
     */
    public static final String DANCING_FONT = "dancing_font";

    /**
     * {@code fonts/decimal.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * 68 101 99 105 109 97 108
     * }</pre>
     */
    public static final String DECIMAL = "decimal";

    /**
     * {@code fonts/defleppard.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ;                        ,                                                                   ;
     * ED.                      Et                                                                  ED.
     * E#Wi                 ,;  E#t                     ,;                                          E#Wi
     * E###G.             f#i   E##t           i      f#i t         t                    j.         E###G.
     * E#fD#W;          .E#t    E#W#t         LE    .E#t  ED.       ED.               .. EW,        E#fD#W;
     * E#t t##L        i#W,     E#tfL.       L#E   i#W,   E#K:      E#K:             ;W, E##j       E#t t##L
     * E#t  .E#K,     L#D.      E#t         G#W.  L#D.    E##W;     E##W;           j##, E###D.     E#t  .E#K,
     * E#t    j##f  :K#Wfff; ,ffW#Dffj.    D#K. :K#Wfff;  E#E##t    E#E##t         G###, E#jG#W;    E#t    j##f
     * E#t    :E#K: i##WLLLLt ;LW#ELLLf.  E#K.  i##WLLLLt E#ti##f   E#ti##f      :E####, E#t t##f   E#t    :E#K:
     * E#t   t##L    .E#L       E#t     .E#E.    .E#L     E#t ;##D. E#t ;##D.   ;W#DG##, E#t  :K#E: E#t   t##L
     * E#t .D#W;       f#E:     E#t    .K#E        f#E:   E#ELLE##K:E#ELLE##K: j###DW##, E#KDDDD###iE#t .D#W;
     * E#tiW#G.         ,WW;    E#t   .K#D          ,WW;  E#L;;;;;;,E#L;;;;;;,G##i,,G##, E#f,t#Wi,,,E#tiW#G.
     * E#K##i            .D#;   E#t  .W#G            .D#; E#t       E#t     :K#K:   L##, E#t  ;#W:  E#K##i
     * E##D.               tt   E#t :W##########Wt     tt E#t       E#t    ;##D.    L##, DWi   ,KK: E##D.
     * E#t                      ;#t :,,,,,,,,,,,,,.                        ,,,      .,,             E#t
     * L:                        :;                                                                 L:
     * }</pre>
     */
    public static final String DEFLEPPARD = "defleppard";

    /**
     * {@code fonts/def_leppard.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ;                        ,                                                                                   ;
     * ED.                      Et                                                                                  ED.
     * E#Wi                 ,;  E#t                                     ,;                                          E#Wi
     * E###G.             f#i   E##t                           i      f#i t         t                    j.         E###G.
     * E#fD#W;          .E#t    E#W#t                         LE    .E#t  ED.       ED.               .. EW,        E#fD#W;
     * E#t t##L        i#W,     E#tfL.                       L#E   i#W,   E#K:      E#K:             ;W, E##j       E#t t##L
     * E#t  .E#K,     L#D.      E#t                         G#W.  L#D.    E##W;     E##W;           j##, E###D.     E#t  .E#K,
     * E#t    j##f  :K#Wfff; ,ffW#Dffj.                    D#K. :K#Wfff;  E#E##t    E#E##t         G###, E#jG#W;    E#t    j##f
     * E#t    :E#K: i##WLLLLt ;LW#ELLLf.                  E#K.  i##WLLLLt E#ti##f   E#ti##f      :E####, E#t t##f   E#t    :E#K:
     * E#t   t##L    .E#L       E#t                     .E#E.    .E#L     E#t ;##D. E#t ;##D.   ;W#DG##, E#t  :K#E: E#t   t##L
     * E#t .D#W;       f#E:     E#t                    .K#E        f#E:   E#ELLE##K:E#ELLE##K: j###DW##, E#KDDDD###iE#t .D#W;
     * E#tiW#G.         ,WW;    E#t                   .K#D          ,WW;  E#L;;;;;;,E#L;;;;;;,G##i,,G##, E#f,t#Wi,,,E#tiW#G.
     * E#K##i            .D#;   E#t    ,;;;;;;;;;.   .W#G            .D#; E#t       E#t     :K#K:   L##, E#t  ;#W:  E#K##i
     * E##D.               tt   E#t    jLLLLLLLLLL, :W##########Wt     tt E#t       E#t    ;##D.    L##, DWi   ,KK: E##D.
     * E#t                      ;#t                 :,,,,,,,,,,,,,.                        ,,,      .,,             E#t
     * L:                        :;                                                                                 L:
     * }</pre>
     */
    public static final String DEF_LEPPARD = "def_leppard";

    /**
     * {@code fonts/delta_corps_priest_1.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ███████�   ▄██████� ▄█       █    ███     ▀   ▄██████� ▄█████� ▄██████   ▄███████�   ▄██████   ▄██████   ▄██████   ▄███████� ▄█  �   ▄██████�   ▄██████    ███     ▀
     * �▄  ███   ▀▖�█   ███    █�██       █�███████��█   ███    █�██ ███    ▄  ███    █�   ███    ███   █▄   ███    �██   ███    �█▄   ███    █   ███    ███   ��██  ��█   ███    █�██   ███    �███████
     * �██ ███    ▖�█   ███    ███       █�██▄    ▀█▖�█   ███    █�███ ███  ��█ ███    ████    ███  ▄███   ███    �██   ███    �██   ███    �███    ███  ▄�█████   ███    █�██   ███    �██▄    ▀█�
     * �██ ███    ▖�   ▄███▄▄██       ██�█▀▀██     ��█   ███    █�  █▀  ███  ██ ███    ███▄▄▄▄██▀ ��██   ███    ��▀    ███      ��██   ███    �██▄▄▄▄██▀ �� ██▀   ▄███▄▄▖�▀    ███      �█▀▀██
     * �██ ███    ▄     ▀▀███▀�█       ██�███   ▀     ██ ▀█████�      ███      �██ ███    �▀▀███▀▀▀▀�███ ▀███�  ▀██████�███ ▀███�▀▀███▀▀▀▀▖�▌ █�     ▀▀███▀�  ▀██████�███   ▀     �
     * �██ ███    ▖�▀       ███    ��       ██▖�██         ███████   █�  ███    █▄��██ ███    �   ▀███████�█████▀    █████          �█████▀    �   ▀█████████▌ ▀▀       ███    ��████          ��██         █�
     * �██ ███   ▄█▄    ███    █▌    ▄ █▖�█         ██�█    ███   █�  ███    █████ ███   ��███   ███    ▖�██          █████    ▄█    ███          ██��███   ███    ▖�██  █▄    ███    �███    ▄█    ██         ██�
     * ███ ████�██   █████�███▄▄█        ▄████    ███   █�█ █████� ███  ▀██�██   ███    ███         ▄███��██  ▄███�█         ▄███�██   ███    █████ �██   █████��██  ▄███▖�        ▄██�
     * ��███▀         █████          ��█ ▀        �█▀              �█    █▀           �██▀           ��███▀        █   ███    ███ █▀                  �████▀        █▀                  █   ███    ███  █▀   █████          �████▀        �█▀
     * }</pre>
     */
    public static final String DELTA_CORPS_PRIEST_1 = "delta_corps_priest_1";

    /**
     * {@code fonts/diamond.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * /\\\\\                                                      /\\
     * /\\   /\\  /\                                               /\\
     * /\\    /\\      /\\    /\\\ /\\ /\\    /\\    /\\ /\\       /\\
     * /\\    /\\/\\ /\\  /\\  /\\  /\  /\\ /\\  /\\  /\\  /\\ /\\ /\\
     * /\\    /\\/\\/\\   /\\  /\\  /\  /\\/\\    /\\ /\\  /\\/\   /\\
     * /\\   /\\ /\\/\\   /\\  /\\  /\  /\\ /\\  /\\  /\\  /\\/\   /\\
     * /\\\\\    /\\  /\\ /\\\/\\\  /\  /\\   /\\    /\\\  /\\ /\\ /\\
     *
     * }</pre>
     */
    public static final String DIAMOND = "diamond";

    /**
     * {@code fonts/dietcola.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * .-.                                     .
     * (_) )-.       .-.        /              /
     * /   \      `-' .-.---/---.-.  .-._. / .-.
     * /     \    /  ./.-'_ /   (    (   ) / (  |
     * .-/.      )_.(__.(__.' /     `---'`-'_/_.-`-'-'
     * (_/  `----'
     * }</pre>
     */
    public static final String DIETCOLA = "dietcola";

    /**
     * {@code fonts/diet_cola.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * .-.                                       .
     * (_) )-.       .-.        /                /
     * /   \      `-' .-.---/---  .-.  .-._. / .-.
     * /     \    /  ./.-'_ /     (    (   ) / (  |
     * .-/.      )_.(__.(__.' /._____.`---'`-'_/_.-`-'-'
     * (_/  `----'               `==='
     * }</pre>
     */
    public static final String DIET_COLA = "diet_cola";

    /**
     * {@code fonts/doh.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     *
     *
     * DDDDDDDDDDDDD                        hhhhhhh
     * D::::::::::::DDD                     h:::::h
     * D:::::::::::::::DD                   h:::::h
     * DDD:::::DDDDD:::::D                  h:::::h
     * D:::::D    D:::::D    ooooooooooo   h::::h hhhhh
     * D:::::D     D:::::D oo:::::::::::oo h::::hh:::::hhh
     * D:::::D     D:::::Do:::::::::::::::oh::::::::::::::hh
     * D:::::D     D:::::Do:::::ooooo:::::oh:::::::hhh::::::h
     * D:::::D     D:::::Do::::o     o::::oh::::::h   h::::::h
     * D:::::D     D:::::Do::::o     o::::oh:::::h     h:::::h
     * D:::::D     D:::::Do::::o     o::::oh:::::h     h:::::h
     * D:::::D    D:::::D o::::o     o::::oh:::::h     h:::::h
     * DDD:::::DDDDD:::::D  o:::::ooooo:::::oh:::::h     h:::::h
     * D:::::::::::::::DD   o:::::::::::::::oh:::::h     h:::::h
     * D::::::::::::DDD      oo:::::::::::oo h:::::h     h:::::h
     * DDDDDDDDDDDDD           ooooooooooo   hhhhhhh     hhhhhhh
     *
     *
     *
     *
     *
     *
     *
     * }</pre>
     */
    public static final String DOH = "doh";

    /**
     * {@code fonts/doom.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ______
     * |  _  \
     * | | | |  ___    ___   _ __ ___
     * | | | | / _ \  / _ \ | '_ ` _ \
     * | |/ / | (_) || (_) || | | | | |
     * |___/   \___/  \___/ |_| |_| |_|
     *
     *
     * }</pre>
     */
    public static final String DOOM = "doom";

    /**
     * {@code fonts/dosrebel.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ����������                                       �����              ����
     * ����۰������                                     �����              �����
     * ����   �����  ������   �����  ��������   ������  ��������   ������  ����
     * ����    ���� ��۰���� ��۰�  ����۰���� ��۰���� ���۰���� ��۰���� ����
     * ����    ���۰��� ���۰������  ���� ��� ��������  ���� ���۰�������  ����
     * ����    ��� ���� ���� ������� ����     ���۰��   ���� ���۰��۰��   ����
     * ����������  ��������  ������  �����    ��������  �������� ��������  �����
     * ����������    ������  ������  �����      ������  ��������   ������  �����
     *
     *
     *
     * }</pre>
     */
    public static final String DOSREBEL = "dosrebel";

    /**
     * {@code fonts/dos_rebel.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ████████�                                                                              █████                     ███�
     * ��█  ░░███░�   ████�    ███�                 ████�    ████░░███         ████� ░░█�
     * ��░░███  ░█�█  ███▖�█  ██�             ��███ ░�██  ██� ░█████�██  ██▖�█  ░�
     * ��█   ░░███ ░░███░█░░  ░�             �███░░�░░███��█  ░███�░░███�██  ░
     * �███    ░███��██ ░█▖�████         ████ ░█�░████░░███ ░�░████�███  �
     * ░███    ░██�█░███ █  ░░░��█████ ░░░  ███ ░█�██ ░███��██ ░█░███
     * █ ░███    ██░███░�░███ �███░��███      ��█░░░   ░███ ░█��█░░░   ░██�
     * █  ███████�██████████░░░░�█████  ░░███�██ ████�░░███�  ███
     * ███  ░░░░░��  ░░░░�█ ░░░░░░░    ░░░░░��██  ░░��███ ░░▖�██  ░░██░░
     * ░░░░░           ��░            ��░░                                    ░░░░    �░░░░░    ░░░░    ░░░
     *
     * }</pre>
     */
    public static final String DOS_REBEL = "dos_rebel";

    /**
     * {@code fonts/dotmatrix.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * _  _  _  _                      _                                        _                         _
     * (_)(_)(_)(_)                    (_)                                      (_)                       (_)
     * (_)      (_)_     _  _  _    _ (_) _  _    _  _   _  _     _  _  _    _ (_) _  _  _       _  _  _  _     _         _
     * (_)        (_) _ (_)(_)(_) _(_)(_)(_)(_)  (_)(_)_(_)(_)   (_)(_)(_) _(_)(_)(_)(_)(_)_  _ (_)(_)(_)(_)   (_) _   _ (_)
     * (_)        (_)(_)         (_)  (_)       (_)   (_)   (_)   _  _  _ (_)  (_)        (_)(_)         (_)      (_)_(_)
     * (_)       _(_)(_)         (_)  (_)     _ (_)   (_)   (_) _(_)(_)(_)(_)  (_)     _  (_)            (_)       _(_)_
     * (_)_  _  (_)  (_) _  _  _ (_)  (_)_  _(_)(_)   (_)   (_)(_)_  _  _ (_)_ (_)_  _(_) (_)          _ (_) _  _ (_) (_) _
     * (_)(_)(_)(_)      (_)(_)(_)       (_)(_)  (_)   (_)   (_)  (_)(_)(_)  (_)  (_)(_)   (_)         (_)(_)(_)(_)       (_)
     *
     *
     * }</pre>
     */
    public static final String DOTMATRIX = "dotmatrix";

    /**
     * {@code fonts/dot_matrix.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * _  _  _  _                      _                                                           _                         _
     * (_)(_)(_)(_)                    (_)                                                         (_)                       (_)
     * (_)      (_)_     _  _  _    _ (_) _  _                       _  _   _  _     _  _  _    _ (_) _  _  _       _  _  _  _     _         _
     * (_)        (_) _ (_)(_)(_) _(_)(_)(_)(_)                     (_)(_)_(_)(_)   (_)(_)(_) _(_)(_)(_)(_)(_)_  _ (_)(_)(_)(_)   (_) _   _ (_)
     * (_)        (_)(_)         (_)  (_)                          (_)   (_)   (_)   _  _  _ (_)  (_)        (_)(_)         (_)      (_)_(_)
     * (_)       _(_)(_)         (_)  (_)     _                    (_)   (_)   (_) _(_)(_)(_)(_)  (_)     _  (_)            (_)       _(_)_
     * (_)_  _  (_)  (_) _  _  _ (_)  (_)_  _(_)                   (_)   (_)   (_)(_)_  _  _ (_)_ (_)_  _(_) (_)          _ (_) _  _ (_) (_) _
     * (_)(_)(_)(_)      (_)(_)(_)       (_)(_)                     (_)   (_)   (_)  (_)(_)(_)  (_)  (_)(_)   (_)         (_)(_)(_)(_)       (_)
     * _  _  _  _  _  _  _
     * (_)(_)(_)(_)(_)(_)(_)
     * }</pre>
     */
    public static final String DOT_MATRIX = "dot_matrix";

    /**
     * {@code fonts/double.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ____   ___ __ ________    ____
     * || \\ // \\|| |||| ))|   ||
     * ||  )|(   ))| ||||=)||   ||==
     * ||_// \\_//\\_//||_))|__|||___
     *
     * }</pre>
     */
    public static final String DOUBLE = "double";

    /**
     * {@code fonts/doubleshorts.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * _____  _____  __ __ ____  __    _____   __ __  __  _____  _____ _____   __
     * ||  ) ((   )) || || ||=)  ||    ||==   ((  ||==|| ((   )) ||_//  ||    ((
     * ||_//  \\_//  \\_// ||_)) ||__| ||___ \_)) ||  ||  \\_//  || \\  ||   \_))
     * }</pre>
     */
    public static final String DOUBLESHORTS = "doubleshorts";

    /**
     * {@code fonts/double_shorts.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * _____  _____  __ __ ____  __    _____ _  __ __  __  _____  _____ _____   __
     * ||  ) ((   )) || || ||=)  ||    ||==    ((  ||==|| ((   )) ||_//  ||    ((
     * ||_//  \\_//  \\_// ||_)) ||__| ||___  \_)) ||  ||  \\_//  || \\  ||   \_))
     * }</pre>
     */
    public static final String DOUBLE_SHORTS = "double_shorts";

    /**
     * {@code fonts/drpepper.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ___
     * | . \ _ _  ___  ___  ___  ___  ___  _ _
     * | | || '_>| . \/ ._>| . \| . \/ ._>| '_>
     * |___/|_|  |  _/\___.|  _/|  _/\___.|_|
     * |_|       |_|  |_|
     * }</pre>
     */
    public static final String DRPEPPER = "drpepper";

    /**
     * {@code fonts/dr_pepper.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ___
     * | . \ _ _      ___  ___  ___  ___  ___  _ _
     * | | || '_>___ | . \/ ._>| . \| . \/ ._>| '_>
     * |___/|_| |___||  _/\___.|  _/|  _/\___.|_|
     * |_|       |_|  |_|
     * }</pre>
     */
    public static final String DR_PEPPER = "dr_pepper";

    /**
     * {@code fonts/dwhistled.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * whistl
     * x      XX
     * x      XX
     * x      XX
     * x      XX
     * x      XX
     * x      .X
     *
     * Dwhistled
     *
     * }</pre>
     */
    public static final String DWHISTLED = "dwhistled";

    /**
     * {@code fonts/eftichess.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ##################
     * ##[`'`']###\`~'/##
     * ###|::|####(o o)##
     * ###|::|#####\ / \#
     * #############"####
     * }</pre>
     */
    public static final String EFTICHESS = "eftichess";

    /**
     * {@code fonts/eftifont.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ___  __       __
     * | __|/ _||| ()/ _| _   _ ||
     * | _| | ] | ]||| ] /o\|/ \| ]
     * |___|L|  L| L|L|  \_/L_n|L|
     *
     * }</pre>
     */
    public static final String EFTIFONT = "eftifont";

    /**
     * {@code fonts/eftipiti.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * __
     * [|-ftipiti
     * `-
     * }</pre>
     */
    public static final String EFTIPITI = "eftipiti";

    /**
     * {@code fonts/eftirobot.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ____   _  _   _           _         _
     * (  __),'_)( ) (_)         ( )       ( )
     * | |_  | | | |  _  __  ___ | |_  ___ | |
     * (  _) ( _)( _)( )( _)( o )( o \( o )( _)
     * /____\/_\ /_\ /_\/_\  \_/ /___/ \_/ /_\
     *
     * }</pre>
     */
    public static final String EFTIROBOT = "eftirobot";

    /**
     * {@code fonts/eftitalic.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ___   _
     * / _/ ,'_7/7 ()/7  _   /7() __
     * / _/ /_7 /_7/7/_7,'o| ///7,','
     * /___///  // ////  |_,7//// \_\
     *
     * }</pre>
     */
    public static final String EFTITALIC = "eftitalic";

    /**
     * {@code fonts/eftiwall.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * _                        .      .    #  #  #  #      |             _     _       _     _
     * +++          _|_|_         ()_()      .  .:::.      #  #..#  #      |.===.      o' \,=./ `o   o' \,=./ `o
     * (o o)         (o o)         (o o)        :(o o):  .  #  #O #) #      {}o o{}        (o o)         (o o)
     * ooO--(_)--Ooo-ooO--(_)--Ooo-ooO--`o'--Ooo-ooO--(_)--Ooo-o#O-#(_#--#oo-ooO--(_)--Ooo-ooO--(_)--Ooo-ooO--(_)--Ooo-
     * }</pre>
     */
    public static final String EFTIWALL = "eftiwall";

    /**
     * {@code fonts/eftiwater.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ___ __ _  o             _
     * )L  )L`)L _ __ _ _ ___  )L __ __
     * ((_ (( (( (( \(((/'((_( (( (('(|
     *
     * }</pre>
     */
    public static final String EFTIWATER = "eftiwater";

    /**
     * {@code fonts/efti_chess.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ##################
     * ##[`'`']###\`~'/##
     * ###|::|####(o o)##
     * ###|::|#####\ / \#
     * #############"####
     * }</pre>
     */
    public static final String EFTI_CHESS = "efti_chess";

    /**
     * {@code fonts/efti_font.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ___  __            __
     * | __|/ _||| ()     / _| _   _ ||
     * | _| | ] | ]||     | ] /o\|/ \| ]
     * |___|L|  L| L| ___ L|  \_/L_n|L|
     * |___|
     * }</pre>
     */
    public static final String EFTI_FONT = "efti_font";

    /**
     * {@code fonts/efti_italic.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ___   _
     * / _/ ,'_7/7 ()    ()/7  _   /7() __
     * / _/ /_7 /_7/7    /7/_7,'o| ///7,','
     * /___///  // //____////  |_,7//// \_\
     * /___/
     * }</pre>
     */
    public static final String EFTI_ITALIC = "efti_italic";

    /**
     * {@code fonts/efti_piti.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * __
     * [|-fti  piti
     * `-   ==
     * }</pre>
     */
    public static final String EFTI_PITI = "efti_piti";

    /**
     * {@code fonts/efti_robot.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ____   _  _   _               _         _
     * (  __),'_)( ) (_)             ( )       ( )
     * | |_  | | | |  _      __  ___ | |_  ___ | |
     * (  _) ( _)( _)( )    ( _)( o )( o \( o )( _)
     * /____\/_\ /_\ /_\____/_\  \_/ /___/ \_/ /_\
     * |____|
     * }</pre>
     */
    public static final String EFTI_ROBOT = "efti_robot";

    /**
     * {@code fonts/efti_wall.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * _                        .      .     '\/`   #  #  #  #      |             _     _       _     _
     * +++          _|_|_         ()_()      .  .:::.       (oo)   #  #..#  #      |.===.      o' \,=./ `o   o' \,=./ `o
     * (o o)         (o o)         (o o)        :(o o):  .  (_`'_)  #  #O #) #      {}o o{}        (o o)         (o o)
     * ooO--(_)--Ooo-ooO--(_)--Ooo-ooO--`o'--Ooo-ooO--(_)--Ooo---_!!_--o#O-#(_#--#oo-ooO--(_)--Ooo-ooO--(_)--Ooo-ooO--(_)--Ooo-
     * }</pre>
     */
    public static final String EFTI_WALL = "efti_wall";

    /**
     * {@code fonts/efti_water.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ___ __ _  o          _
     * )L  )L`)L_  _ _ ___  )L __ __
     * ((_ (( ((    (/'((_( (( (('(|
     * ===
     * }</pre>
     */
    public static final String EFTI_WATER = "efti_water";

    /**
     * {@code fonts/electronic.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ▄▄▄▄▄▄▄▄▄▄� ▄           ▐░� ▄▄▄▄▄▄▄▄▄▄� ▄▄▄▄▄▄▄▄� ▄▄▄▄▄▄▄ ▄▄▄▄▄▄▄▄▄� ▄▄▄▄▄▄▄▄▄� ▄▄        ▄ ▐░� ▄▄▄▄▄▄▄▄� ▄▄▄▄▄▄▄▄�
     * �� ▐░░░░░░░░▖�          ▐░▌ �� ▐░░░░░░░░▄▄▄ ▐░░░░░�▄▄▄▄ ▐░░��▄ ▐░░░░░░▄▄ ▐░░░░░░░░▌      ▐░▌▐░�▄▄ ▐░░░░░�▄▄ ▐░░░░░�
     * �░░▌▐░█▀▀▀▀�         ▐░▌    �░░▌▐░█▀▀▀▀░░░░░░▌▐░�░░░░░░░�░░░░▌▐░█▀░░░░▌▐░█▀▀�▌░▌     ▐░▌▐��░░░░░▌ ▀▀��░░░░░▌▐░�
     * ��▀▀▀▀ ▐░▌              ▐░▌       ��▀▀▀▀ ▐░▌        ��▀▀▀▀▀▀▀▀░░▌ ▀▀▀▀▀▀▀▀▀▀█░▌▐��▀▀▀▀█░▌▐░�░▌▐░▌    ▐░�▀▀█░█▀▀▀▀��▀▀▀▀▀▀▀▀�
     * ▐░█▄▄▄▄▄▄▄   ▐░▌            ▐░█▄▄▄▄▄▄▄�� ▐░▌          ▐▖�░█▀▀▀▀  ░▌       ▐░▌▐░▌       ▐░▌▐░▌   ��▐░▌ ▐░▌   �      ▐░▌          ▖� ▐░▌          ▐�
     * ▄▄ ▐░░░░░░░�▐░▌          ▐▄▄ ▐░░░░░░░�▌          ▐░▌        ▐░▌         ��▄▄▄▄▄▄▄█░    ▐░▌▐░▌       �░▌▐░▌  ▐░▐░▌          ▐░▌ �▌          ▐░▌
     * ��░░░▌▐░█▀▀▀░▌          ▐░��░░░▌▐░█▀▀▀      ▐░▌          � ▐░▌          �▌▐░░░░░░░▖�░▌▐░▌       ▐░�  ▐░▌▐░▌   �         ▐░▌               ▐░▌          �
     * ▀▀▀▀▀▀ ▐░▌    █▄▄▄▄▄▄�▀▀▀▀▀▀ ▐░▌    �░▌          ▐░█�░▌          ▐░░░░▌▐░█▀▀�▌▐░▌       ▐░▌▐░▌ ▐░▌▐░▌ ▐░▌      ▄▄▄▐░▌          ▐░█�
     * ▐░█▄▄▄▄▄▖�▄▄ ▐░░░�      ▐░█▄▄▄▄▄▖�▄▄▄▄▄▄▄▄ �▌          ▐░▖�▀█░█▀▀ ▐░▐░█▄▄▄▄▄▄▄�    ▐░▌▐░▌▐�█░█▄▄▄▄ ▐▄▄▄▄▄▄▄▄▄
     * �▄▄▄ ▐░░░░░░��░░░░░░▄▄▄▄ ▐░░░░░░▐░░░░░░░░�          ▐░▌  �     ▐░▌  ▐░▌   �░▌▐░░░░░░▖�▌     ▐░▐░▌░░░░░░░░░�▐░░░░░░░░
     * ░░░░░▌ ▀▀▀▀�▌ ▀▀▀▀▀�░░░░░▌ ▀▀▀▀�░░░▌ ▀▀▀▀�        ▐░▌        ▐░▌ ▐░▌       �░░░░▌ ▀▀▀▀▐░▌      ▐░░▌��░▌ ▀▀▀▀▀▀░░░▌ ▀▀▀▀�
     * ��▀▀▀▀▀▀            �▀▀▀▀▀      ��▀▀▀▀▀▀            �▀▀▀▀▀▀              ▀             ▐░▌ ▀         ▀    ��▀▀▀▀▀▀           ▀        ▀▀        ▀▀▀▀▀            �▀▀▀▀▀▀
     * }</pre>
     */
    public static final String ELECTRONIC = "electronic";

    /**
     * {@code fonts/elite.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ▄▄▄ .�▄▄▌  ▪  �▄▄▄▄▄▄▄ .�
     * ��▄.▀·�██•  �█ �▄•██��▄.▀·�
     * ��▀▀▪�██▪  �█·�   ▐█.▖�▀▀▪�
     * ��▐█▄�▐█▌▖�█▪ ▐█▌�▐█▄�
     * ��▌ ▀▀�▌.▀▀�▀▀� ▀▀▀ ��▌ ▀▀
     * }</pre>
     */
    public static final String ELITE = "elite";

    /**
     * {@code fonts/epic.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * _______  _______ _________ _______
     * (  ____ \(  ____ )\__   __/(  ____ \
     * | (    \/| (    )|   ) (   | (    \/
     * | (__    | (____)|   | |   | |
     * |  __)   |  _____)   | |   | |
     * | (      | (         | |   | |
     * | (____/\| )      ___) (___| (____/\
     * (_______/|/       \_______/(_______/
     *
     * }</pre>
     */
    public static final String EPIC = "epic";

    /**
     * {@code fonts/fender.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * '||''''|                     ||`
     * ||  .                       ||
     * ||''|   .|''|, `||''|,  .|''||  .|''|, '||''|
     * ||      ||..||  ||  ||  ||  ||  ||..||  ||
     * .||.     `|...  .||  ||. `|..||. `|...  .||.
     *
     *
     * }</pre>
     */
    public static final String FENDER = "fender";

    /**
     * {@code fonts/filter.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * o8boooo    8888 888      888888888   ,d8PPPP   ,dbPPPp
     * 88booop    8888 888         '88d     d88ooo    d88ooP'
     * 88b        8888 888        '888    ,88'      ,88' P'
     * 88P        8888 888PPPPP '88p      88bdPPP   88  do
     *
     * }</pre>
     */
    public static final String FILTER = "filter";

    /**
     * {@code fonts/fire_font_k.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * (
     * )\ )                    (                    )         )
     * (()/(  (   (      (      )\ )              ( /(      ( /(
     * /(_)) )\  )(    ))\    (()/(   (    (     )\())     )\())
     * (_))_|((_)(()\  /((_)    /(_))  )\   )\ ) (_))/     ((_)\
     * | |_   (_) ((_)(_))     (_) _| ((_) _(_/( | |_      | |(_)
     * | __|  | || '_|/ -_)     |  _|/ _ \| ' \))|  _|     | / /
     * |_|    |_||_|  \___|_____|_|  \___/|_||_|  \__|_____|_\_\
     * |_____|                    |_____|
     * }</pre>
     */
    public static final String FIRE_FONT_K = "fire_font_k";

    /**
     * {@code fonts/fire_font_s.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * (
     * )\ )               (                 )
     * (()/( (  (     (    )\ )           ( /(
     * /(_)))\ )(   ))\  (()/(  (   (    )\())   (
     * (_))_((_|()\ /((_)  /(_)) )\  )\ )(_))/    )\
     * | |_  (_)((_|_))   (_) _|((_)_(_/(| |_    ((_)
     * | __| | | '_/ -_)   |  _/ _ \ ' \))  _|   (_-<
     * |_|   |_|_| \___|___|_| \___/_||_| \__|___/__/
     * |_____|               |_____|
     * }</pre>
     */
    public static final String FIRE_FONT_S = "fire_font_s";

    /**
     * {@code fonts/flipped.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ____              ____  ____  ____  ____
     * |_   | ____  ____ |_   ||_   ||    || __ |
     * || ||  __||____|  || |  || |||_| || |/ |
     * |_||_|           \__/  \__/|_||_|\___/
     * }</pre>
     */
    public static final String FLIPPED = "flipped";

    /**
     * {@code fonts/flowerpower.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ________   .---.       ,-----.    .--.      .--.    .-''-.  .-------.    .-------.     ,-----.    .--.      .--.    .-''-.  .-------.
     * |        |  | ,_|     .'  .-,  '.  |  |_     |  |  .'_ _   \ |  _ _   \   \  _(`)_ \  .'  .-,  '.  |  |_     |  |  .'_ _   \ |  _ _   \
     * |   .----',-./  )    / ,-.|  \ _ \ | _( )_   |  | / ( ` )   '| ( ' )  |   | (_ o._)| / ,-.|  \ _ \ | _( )_   |  | / ( ` )   '| ( ' )  |
     * |  _|____ \  '_ '`) ;  \  '_ /  | :|(_ o _)  |  |. (_ o _)  ||(_ o _) /   |  (_,_) /;  \  '_ /  | :|(_ o _)  |  |. (_ o _)  ||(_ o _) /
     * |_( )_   | > (_)  ) |  _`,/ \ _/  || (_,_) \ |  ||  (_,_)___|| (_,_).' __ |   '-.-' |  _`,/ \ _/  || (_,_) \ |  ||  (_,_)___|| (_,_).' __
     * (_ o._)__|(  .  .-' : (  '\_/ \   ;|  |/    \|  |'  \   .---.|  |\ \  |  ||   |     : (  '\_/ \   ;|  |/    \|  |'  \   .---.|  |\ \  |  |
     * |(_,_)     `-'`-'|___\ `"/  \  ) / |  '  /\  `  | \  `-'    /|  | \ `'   /|   |      \ `"/  \  ) / |  '  /\  `  | \  `-'    /|  | \ `'   /
     * |   |       |        \'. \_/``".'  |    /  \    |  \       / |  |  \    / /   )       '. \_/``".'  |    /  \    |  \       / |  |  \    /
     * '---'       `--------`  '-----'    `---'    `---`   `'-..-'  ''-'   `'-'  `---'         '-----'    `---'    `---`   `'-..-'  ''-'   `'-'
     *
     * }</pre>
     */
    public static final String FLOWERPOWER = "flowerpower";

    /**
     * {@code fonts/flower_power.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ________   .---.       ,-----.    .--.      .--.    .-''-.  .-------.                    .-------.     ,-----.    .--.      .--.    .-''-.  .-------.
     * |        |  | ,_|     .'  .-,  '.  |  |_     |  |  .'_ _   \ |  _ _   \                   \  _(`)_ \  .'  .-,  '.  |  |_     |  |  .'_ _   \ |  _ _   \
     * |   .----',-./  )    / ,-.|  \ _ \ | _( )_   |  | / ( ` )   '| ( ' )  |                   | (_ o._)| / ,-.|  \ _ \ | _( )_   |  | / ( ` )   '| ( ' )  |
     * |  _|____ \  '_ '`) ;  \  '_ /  | :|(_ o _)  |  |. (_ o _)  ||(_ o _) /                   |  (_,_) /;  \  '_ /  | :|(_ o _)  |  |. (_ o _)  ||(_ o _) /
     * |_( )_   | > (_)  ) |  _`,/ \ _/  || (_,_) \ |  ||  (_,_)___|| (_,_).' __                 |   '-.-' |  _`,/ \ _/  || (_,_) \ |  ||  (_,_)___|| (_,_).' __
     * (_ o._)__|(  .  .-' : (  '\_/ \   ;|  |/    \|  |'  \   .---.|  |\ \  |  |   _ _     _ _  |   |     : (  '\_/ \   ;|  |/    \|  |'  \   .---.|  |\ \  |  |
     * |(_,_)     `-'`-'|___\ `"/  \  ) / |  '  /\  `  | \  `-'    /|  | \ `'   /--( ' )---(_I_)-|   |      \ `"/  \  ) / |  '  /\  `  | \  `-'    /|  | \ `'   /
     * |   |       |        \'. \_/``".'  |    /  \    |  \       / |  |  \    /  (_{;}_) (_(=)_)/   )       '. \_/``".'  |    /  \    |  \       / |  |  \    /
     * '---'       `--------`  '-----'    `---'    `---`   `'-..-'  ''-'   `'-'  --(_,_)---(_I_)-`---'         '-----'    `---'    `---`   `'-..-'  ''-'   `'-'
     *
     * }</pre>
     */
    public static final String FLOWER_POWER = "flower_power";

    /**
     * {@code fonts/fourtops.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * |~~             |
     * |--/~\|   ||/~\~|~/~\|~~\(~
     * |  \_/ \_/||    | \_/|__/_)
     * |
     * }</pre>
     */
    public static final String FOURTOPS = "fourtops";

    /**
     * {@code fonts/four_tops.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * |~~               |
     * |--/~\|   ||/~\  ~|~/~\|~~\(~
     * |  \_/ \_/||   __ | \_/|__/_)
     * |
     * }</pre>
     */
    public static final String FOUR_TOPS = "four_tops";

    /**
     * {@code fonts/fraktur.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * .....                                         ..           s
     * .H8888888x.  '`+                           < .z@8"`          :8
     * :888888888888x.  !    .u    .                !@88E           .88       x.    .        .u    .
     * 8~    `"*88888888"  .d88B :@8c        u      '888E   u      :888ooo  .@88k  z88u    .d88B :@8c
     * !      .  `f""""   ="8888f8888r    us888u.    888E u@8NL  -*8888888 ~"8888 ^8888   ="8888f8888r
     * ~:...-` :8L <)88:   4888>'88"  .@88 "8888"   888E`"88*"    8888      8888  888R     4888>'88"
     * .   :888:>X88!   4888> '    9888  9888    888E .dN.     8888      8888  888R     4888> '
     * :~"88x 48888X ^`    4888>      9888  9888    888E~8888     8888      8888  888R     4888>
     * <  :888k'88888X     .d888L .+   9888  9888    888E '888&   .8888Lu=   8888 ,888B .  .d888L .+
     * d8888f '88888X    ^"8888*"    9888  9888    888E  9888.  ^%888*    "8888Y 8888"   ^"8888*"
     * :8888!    ?8888>      "Y"      "888*""888" '"888*" 4888"    'Y"      `Y"   'YP        "Y"
     * X888!      8888~                ^Y"   ^Y'     ""    ""
     * '888       X88f
     * '%8:     .8*"
     * ^----~"`
     * }</pre>
     */
    public static final String FRAKTUR = "fraktur";

    /**
     * {@code fonts/funface.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * wWw  wWw\\\  ///               c  c
     * wWw   (O)  (O)((O)(O))  wWw   /)     (OO)  wWw
     * (O)_  / )  ( \ | \ ||   (O)_(o)(O) ,'.--.) (O)_
     * .' __)/ /    \ \||\\||  .' __)//\\ / //_|_\.' __)
     * (  _)  | \____/ ||| \ | (  _) |(__)|| \___ (  _)
     * )/    '. `--' .`||  ||  )/   /,-. |'.    ) `.__)
     * (        `-..-' (_/  \_)(    -'   ''  `-.'
     * }</pre>
     */
    public static final String FUNFACE = "funface";

    /**
     * {@code fonts/funfaces.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * wWw  wWw  wWw\\\  ///  wWw           c  c  wWw   oo_
     * (O)_ (O)  (O)((O)(O))  (O)_   /)     (OO)  (O)_ /  _)-<
     * / __)/ )  ( \ | \ ||   / __)(o)(O) ,'.--.) / __)\__ `.
     * / (  / /    \ \||\\||  / (    //\\ / //_|_\/ (      `. |
     * (  _) | \____/ ||| \ | (  _)  |(__)|| \___ (  _)     _| |
     * / /   '. `--' .`||  || / /    /,-. |'.    ) \ \_  ,-'   |
     * )/      `-..-' (_/  \_))/    -'   ''  `-.'   \__)(_..--'
     * }</pre>
     */
    public static final String FUNFACES = "funfaces";

    /**
     * {@code fonts/fun_face.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * wWw  wWw\\\  /// _                 c  c
     * wWw   (O)  (O)((O)(O))      wWw   /)     (OO)  wWw
     * (O)_  / )  ( \ | \ ||       (O)_(o)(O) ,'.--.) (O)_
     * .' __)/ /    \ \||\\||      .' __)//\\ / //_|_\.' __)
     * (  _)  | \____/ ||| \ |     (  _) |(__)|| \___ (  _)
     * )/    '. `--' .`||  ||      )/   /,-. |'.    ) `.__)
     * (        `-..-' (_/  \_)    (    -'   ''  `-.'
     * }</pre>
     */
    public static final String FUN_FACE = "fun_face";

    /**
     * {@code fonts/fun_faces.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * wWw  wWw  wWw\\\  ///         wWw           c  c  wWw   oo_
     * (O)_ (O)  (O)((O)(O))         (O)_   /)     (OO)  (O)_ /  _)-<
     * / __)/ )  ( \ | \ ||          / __)(o)(O) ,'.--.) / __)\__ `.
     * / (  / /    \ \||\\||         / (    //\\ / //_|_\/ (      `. |
     * (  _) | \____/ ||| \ |        (  _)  |(__)|| \___ (  _)     _| |
     * / /   '. `--' .`||  ||  _____ / /    /,-. |'.    ) \ \_  ,-'   |
     * )/      `-..-' (_/  \_)[_____])/    -'   ''  `-.'   \__)(_..--'
     * }</pre>
     */
    public static final String FUN_FACES = "fun_faces";

    /**
     * {@code fonts/fuzzy.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * .---.
     * : .--'
     * : `;.-..-..---. .---. .-..-.
     * : : : :; :`-'_.'`-'_.': :; :
     * :_; `.__.'`.___;`.___;`._. ;
     * .-. :
     * `._.'
     * }</pre>
     */
    public static final String FUZZY = "fuzzy";

    /**
     * {@code fonts/georgi16.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     *
     *
     * ____                                                   ,6P
     * 6MMMMb/                                     68b       6MM'
     * 8P    YM                                     Y89      6M'
     * 6M      Y   ____     _____   ___  __   __     ___ __/ 6M ____
     * MM         6MMMMb   6MMMMMb  `MM 6MM  6MMbMMM `MM `MM MMMMMMMb
     * MM        6M'  `Mb 6M'   `Mb  MM69 " 6M'`Mb    MM  MM MM'   `Mb
     * MM     ___MM    MM MM     MM  MM'    MM  MM    MM  MM MM     MM
     * MM     `M'MMMMMMMM MM     MM  MM     YM.,M9    MM  MM MM     MM
     * YM      M MM       MM     MM  MM      YMM9     MM  MM MM     MM
     * 8b    d9 YM    d9 YM.   ,M9  MM     (M        MM  MM YM.   ,M9
     * YMMMM9   YMMMM9   YMMMMM9  _MM_     YMMMMb. _MM__MM_ YMMMMM9
     * 6M    Yb
     * YM.   d9
     * YMMMM9
     * }</pre>
     */
    public static final String GEORGI16 = "georgi16";

    /**
     * {@code fonts/georgia11.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     *
     * ,,
     * .g8"""bgd                                       db
     * .dP'     `M                                                     __,   __,
     * dM'       `   .gP"Ya   ,pW"Wq.`7Mb,od8 .P"Ybmmm `7MM   ,6"Yb.  `7MM  `7MM
     * MM           ,M'   Yb 6W'   `Wb MM' "':MI  I8     MM  8)   MM    MM    MM
     * MM.    `7MMF'8M"""""" 8M     M8 MM     WmmmP"     MM   ,pm9MM    MM    MM
     * `Mb.     MM  YM.    , YA.   ,A9 MM    8M          MM  8M   MM    MM    MM
     * `"bmmmdPY   `Mbmmd'  `Ybmd9'.JMML.   YMMMMMb  .JMML.`Moo9^Yo..JMML..JMML.
     * 6'     dP
     * Ybmmmd'
     * }</pre>
     */
    public static final String GEORGIA11 = "georgia11";

    /**
     * {@code fonts/ghost.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ('-. .-.               .-')    .-') _
     * ( OO )  /              ( OO ). (  OO) )
     * ,----.    ,--. ,--. .-'),-----. (_)---\_)/     '._
     * '  .-./-') |  | |  |( OO'  .-.  '/    _ | |'--...__)
     * |  |_( O- )|   .|  |/   |  | |  |\  :` `. '--.  .--'
     * |  | .--, \|       |\_) |  |\|  | '..`''.)   |  |
     * (|  | '. (_/|  .-.  |  \ |  | |  |.-._)   \   |  |
     * |  '--'  | |  | |  |   `'  '-'  '\       /   |  |
     * `------'  `--' `--'     `-----'  `-----'    `--'
     * }</pre>
     */
    public static final String GHOST = "ghost";

    /**
     * {@code fonts/ghoulish.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * )\.-.        .'(     .-./(       .-.   .')      .'(    )\.--.       .'(
     * ,' ,-,_)   ,') \  )  ,'     )  ,'  /  ) ( /       \  )  (   ._.'  ,') \  )
     * (  .   __  (  '-' (  (  .-, (  (  ) | (   ))       ) (    `-.`.   (  '-' (
     * ) '._\ _)  ) .-.  )  ) '._\ )  ) '._\ )  )'._.-.  \  )  ,_ (  \   ) .-.  )
     * (  ,   (   (  ,  ) \ (  ,   (  (  ,   (  (       )  ) \ (  '.)  ) (  ,  ) \
     * )/'._.'    )/    )/  )/ ._.'   )/ ._.'   )/,__.'    )/  '._,_.'   )/    )/
     *
     * }</pre>
     */
    public static final String GHOULISH = "ghoulish";

    /**
     * {@code fonts/glenyn.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ____ __   ____ __   _    __
     * |  _\| |  | __\| \|\||_/\| \|\
     * | [ \| |__|  ]_|  \|| __/|  \|
     * |___/|___/|___/|/\_/|/   |/\_/
     * }</pre>
     */
    public static final String GLENYN = "glenyn";

    /**
     * {@code fonts/goofy.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * __       _____     _____     ___        ___   __   __
     * )  ____)    )   (     )   (   \    ___) (  (  )  )
     * /  /  __    /     \   /     \   |  (__    \  \/  /
     * (  (  (  \  (       ) (       )  |   __)    \    /
     * \  \__)  )  \     /   \     /   |  (        )  /
     * __)      (____)   (_____)   (___/    \______/  (_____
     * }</pre>
     */
    public static final String GOOFY = "goofy";

    /**
     * {@code fonts/gothic.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * __ ,
     * ,-| ~           ,  ,,
     * ('||/__,        ||  ||     '
     * (( |||  |  /'\\ =||= ||/\\ \\  _-_
     * (( |||==| || ||  ||  || || || ||
     * ( / |  , || ||  ||  || || || ||
     * -____/  \\,/   \\, \\ |/ \\ \\,/
     * _/
     *
     * }</pre>
     */
    public static final String GOTHIC = "gothic";

    /**
     * {@code fonts/graceful.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ___  ____   __    ___  ____  ____  _  _  __
     * / __)(  _ \ / _\  / __)(  __)(  __)/ )( \(  )
     * ( (_ \ )   //    \( (__  ) _)  ) _) ) \/ (/ (_/\
     * \___/(__\_)\_/\_/ \___)(____)(__)  \____/\____/
     * }</pre>
     */
    public static final String GRACEFUL = "graceful";

    /**
     * {@code fonts/gradient.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * .eeeeee..eeeeeee...eeeeee..eeeeeee..eee.eeeeee.eeeeeee..eeeeeeeee.
     * @@@@@@@@:@@@@@@@@:@@@@@@@@:@@@@@@@@:@@@:@@@@@@:@@@@@@@@:@@@@@@@@@:
     * %%%------%%%--%%%-%%%--%%%-%%%--%%%-%%%-%%%----%%%--%%%----%%%----
     * &&&++++++&&&&&&&++&&&&&&&&+&&&++&&&+&&&+&&&&&++&&&++&&&++++&&&++++
     * |||*||||*||||||***||||||||*|||**|||*|||*|||||**|||**|||****|||****
     * !!!==!!!=!!!=!!!==!!!==!!!=!!!==!!!=!!!=!!!====!!!==!!!====!!!====
     * ::::::::#:::##:::#:::##:::#::::::::#:::#::::::#:::##:::####:::####
     * @......@@...@@...@...@@...@.......@@...@......@...@@...@@@@...@@@@
     *
     * }</pre>
     */
    public static final String GRADIENT = "gradient";

    /**
     * {@code fonts/graffiti.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ________                   _____   _____ .__   __   .__
     * /  _____/ _______ _____   _/ ____\_/ ____\|__|_/  |_ |__|
     * /   \  ___ \_  __ \\__  \  \   __\ \   __\ |  |\   __\|  |
     * \    \_\  \ |  | \/ / __ \_ |  |    |  |   |  | |  |  |  |
     * \______  / |__|   (____  / |__|    |__|   |__| |__|  |__|
     * \/              \/
     * }</pre>
     */
    public static final String GRAFFITI = "graffiti";

    /**
     * {@code fonts/greek.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     *
     * _____
     * |  ___)
     * | |      ___   ___  ___  _  __
     * | |     / _ \ / __)/ __)| |/ /
     * | |    | |_) )> _) > _) |   <
     * |_|    |  __/ \___)\___)|_|\_\
     * | |
     * |_|
     * }</pre>
     */
    public static final String GREEK = "greek";

    /**
     * {@code fonts/heart_left.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * .-.-. .-.-. .-.-. .-.-. .-.-. .-.-. .-.-. .-.-. .-.-. .-.-.
     * ( H .'( e .'( a .'( r .'( t .'( _ .'( l .'( e .'( f .'( t .'
     * `.(   `.(   `.(   `.(   `.(   '.(   `.(   `.(   `.(   `.(
     *
     * }</pre>
     */
    public static final String HEART_LEFT = "heart_left";

    /**
     * {@code fonts/heart_right.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * .-.-. .-.-. .-.-. .-.-. .-.-. .-.-. .-.-. .-.-. .-.-. .-.-. .-.-.
     * '. H )'. e )'. a )'. r )'. t )'. _ )'. r )'. i )'. g )'. h )'. t )
     * ).'   ).'   ).'   ).'   ).'   ).'   ).'   ).'   ).'   ).'   ).'
     *
     * }</pre>
     */
    public static final String HEART_RIGHT = "heart_right";

    /**
     * {@code fonts/henry3d.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * _  _                                            ____         _
     * FJ  L]     ____     _ ___     _ ___   _    _    F___ J     ___FJ
     * J |__| L   F __ J   J '__ J   J '__ ",J |  | L   `-__| L   F __  L
     * |  __  |  | _____J  | |__| |  | |__|-J| |  | |    |__  (  | |--| |
     * F L__J J  F L___--. F L  J J  F L  `-'F L__J J .-____] J  F L__J J
     * J__L  J__LJ\______/FJ__L  J__LJ__L     )-____  LJ\______/FJ\____,__L
     * |__L  J__| J______F |__L  J__||__L    J\______/F J______F  J____,__F
     * J______F
     * }</pre>
     */
    public static final String HENRY3D = "henry3d";

    /**
     * {@code fonts/henry_3d.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * _  _                                                     ____         _
     * FJ  L]     ____     _ ___     _ ___   _    _             F___ J     ___FJ
     * J |__| L   F __ J   J '__ J   J '__ ",J |  | L            `-__| L   F __  L
     * |  __  |  | _____J  | |__| |  | |__|-J| |  | |             |__  (  | |--| |
     * F L__J J  F L___--. F L  J J  F L  `-'F L__J J          .-____] J  F L__J J
     * J__L  J__LJ\______/FJ__L  J__LJ__L     )-____  L ________J\______/FJ\____,__L
     * |__L  J__| J______F |__L  J__||__L    J\______/F|________|J______F  J____,__F
     * J______F L________J
     * }</pre>
     */
    public static final String HENRY_3D = "henry_3d";

    /**
     * {@code fonts/hex.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * 48 65 78
     * }</pre>
     */
    public static final String HEX = "hex";

    /**
     * {@code fonts/hieroglyphs.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ()  ;.                                    ,-.       ,-.\\ \\               ,-.
     * () ; |          ||          .-.   ____   <,- \_____/  ` \\ \\         ___  | |
     * () `.| ....     ||  .---.  _|_ \  /  \     /  ___. \     \\ \\   __  |   | | '
     * /\   | `=.`''===.' '.___.' (_)   /_/\_\ ,_(__/ ,_(__\     \\ \\ |__| | |_| |
     * }</pre>
     */
    public static final String HIEROGLYPHS = "hieroglyphs";

    /**
     * {@code fonts/hollywood.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * _
     * ' )     )           /' /'                                               /'
     * /'    /'          /' /'                                               /'
     * ,/'    /' ____     /' /'         .   . ,   ,   ____     ____     _____,/'
     * /`---,/' /'    )--/' /'    /'    /|   |/   /  /'    )--/'    )--/'    /'
     * /'    /' /'    /' /' /'    /'    /' |  /|  /' /'    /' /'    /' /'    /'
     * (,/'     (_,(___,/'  (__(__   (___,/(___|/' |/(__(___,/'  (___,/'  (___,/(__
     * /'
     * /     /'
     * (___,/'
     * }</pre>
     */
    public static final String HOLLYWOOD = "hollywood";

    /**
     * {@code fonts/horizontalleft.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * _______   _______   _______   _     _   _     _   _______   _______   _          ______   _______   _______   _______   _______   _
     * \__   __\ /  ____ \ / ___  _| | |___| | | |  .` | /  ____ \ `._   __| | /_____  .`  _ ._| /______ \ /______ \ | ._ _. | |  _ ___| | /_____
     * __| |__  | /___/ | | \_/  \  |  ___  | | |.`_. | | /___/ |  _`. `._  | ______/ \  \_||_        / |       / | | \ v / | | ||_\    | ______/
     * \_______\ \_______/ `.__.`\_| |_|   |_| |__.` |_| \_______/ |_______| |_\        `._____|       \_|       \_| |_/   \_| |_/       |_\
     *
     *
     * }</pre>
     */
    public static final String HORIZONTALLEFT = "horizontalleft";

    /**
     * {@code fonts/horizontalright.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * _______   _______   _______   _     _   _     _   _______   _______         _   ______    _______   _______   _     _   _______   _______         _
     * \__   __\ /  ____ \ |_  ___ \ | |___| | | '.  | | /  ____ \ |__   _.'  _____\ | |_. _  '. / ______\ |_  ___ \ | |___| | / .---. \ \__   __\  _____\ |
     * __| |__  | /___/ |  /  \_/ | |  ___  | | ._'.| | | /___/ |  _.' .'_  \______ |  _||_/  / | \        /  \_/ | |  ___  | \_'-. / |  __| |__  \______ |
     * \_______\ \_______/ |_/'.__.' |_|   |_| |_| '.__| \_______/ |_______|       /_| |_____.'  |_/       |_/'.__.' |_|   |_|   '.| \_/ \_______\       /_|
     *
     *
     * }</pre>
     */
    public static final String HORIZONTALRIGHT = "horizontalright";

    /**
     * {@code fonts/horizontal_left.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * _______   _______   _______   _     _   _     _   _______   _______   _          ______   _______             _______   _______   _______   _
     * \__   __\ /  ____ \ / ___  _| | |___| | | |  .` | /  ____ \ `._   __| | /_____  .`  _ ._| /______ \           /______ \ | ._ _. | |  _ ___| | /_____
     * __| |__  | /___/ | | \_/  \  |  ___  | | |.`_. | | /___/ |  _`. `._  | ______/ \  \_||_        / |                 / | | \ v / | | ||_\    | ______/
     * \_______\ \_______/ `.__.`\_| |_|   |_| |__.` |_| \_______/ |_______| |_\        `._____|       \_|                 \_| |_/   \_| |_/       |_\
     * ________
     * [________]
     * }</pre>
     */
    public static final String HORIZONTAL_LEFT = "horizontal_left";

    /**
     * {@code fonts/horizontal_right.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * _______   _______   _______   _     _   _     _   _______   _______         _   ______    _______             _______   _     _   _______   _______         _
     * \__   __\ /  ____ \ |_  ___ \ | |___| | | '.  | | /  ____ \ |__   _.'  _____\ | |_. _  '. / ______\           |_  ___ \ | |___| | / .---. \ \__   __\  _____\ |
     * __| |__  | /___/ |  /  \_/ | |  ___  | | ._'.| | | /___/ |  _.' .'_  \______ |  _||_/  / | \                  /  \_/ | |  ___  | \_'-. / |  __| |__  \______ |
     * \_______\ \_______/ |_/'.__.' |_|   |_| |_| '.__| \_______/ |_______|       /_| |_____.'  |_/                 |_/'.__.' |_|   |_|   '.| \_/ \_______\       /_|
     * ________
     * [________]
     * }</pre>
     */
    public static final String HORIZONTAL_RIGHT = "horizontal_right";

    /**
     * {@code fonts/icl_1900.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * Icl_1900
     * * R
     * X
     * 0  **
     * 1*
     * 2
     * *3
     * 4
     * 5
     * 6
     * 7
     * 8
     *  9 *
     * }</pre>
     */
    public static final String ICL_1900 = "icl_1900";

    /**
     * {@code fonts/impossible.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * _         _   _         _          _            _           _           _          _               _             _
     * /\ \      /\_\/\_\ _    /\ \       /\ \         / /\        / /\        /\ \       / /\            _\ \          /\ \
     * \ \ \    / / / / //\_\ /  \ \     /  \ \       / /  \      / /  \       \ \ \     / /  \          /\__ \        /  \ \
     * /\ \_\  /\ \/ \ \/ / // /\ \ \   / /\ \ \     / / /\ \__  / / /\ \__    /\ \_\   / / /\ \        / /_ \_\      / /\ \ \
     * / /\/_/ /  \____\__/ // / /\ \_\ / / /\ \ \   / / /\ \___\/ / /\ \___\  / /\/_/  / / /\ \ \      / / /\/_/     / / /\ \_\
     * / / /   / /\/________// / /_/ / // / /  \ \_\  \ \ \ \/___/\ \ \ \/___/ / / /    / / /\ \_\ \    / / /         / /_/_ \/_/
     * / / /   / / /\/_// / // / /__\/ // / /   / / /   \ \ \       \ \ \      / / /    / / /\ \ \___\  / / /         / /____/\
     * / / /   / / /    / / // / /_____// / /   / / /_    \ \ \  _    \ \ \    / / /    / / /  \ \ \__/ / / / ____    / /\____\/
     * ___/ / /__ / / /    / / // / /      / / /___/ / //_/\__/ / / /_/\__/ / /___/ / /__  / / /____\_\ \  / /_/_/ ___/\ / / /______
     * /\__\/_/___\\/_/    / / // / /      / / /____\/ / \ \/___/ /  \ \/___/ //\__\/_/___\/ / /__________\/_______/\__\// / /_______\
     * \/_________/        \/_/ \/_/       \/_________/   \_____\/    \_____\/ \/_________/\/_____________/\_______\/    \/__________/
     *
     * }</pre>
     */
    public static final String IMPOSSIBLE = "impossible";

    /**
     * {@code fonts/invita.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * _____
     * (, /          ,
     * / __  _ _    _/_ _
     * ___/__/ (_(/___(_(__(_(_
     * (__ /
     *
     * }</pre>
     */
    public static final String INVITA = "invita";

    /**
     * {@code fonts/isometric1.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ___           ___           ___           ___           ___           ___                       ___
     * ___        /\  \         /\  \         /\__\         /\  \         /\  \         /\  \          ___        /\  \
     * /\  \      /::\  \       /::\  \       /::|  |       /::\  \        \:\  \       /::\  \        /\  \      /::\  \
     * \:\  \    /:/\ \  \     /:/\:\  \     /:|:|  |      /:/\:\  \        \:\  \     /:/\:\  \       \:\  \    /:/\:\  \
     * /::\__\  _\:\~\ \  \   /:/  \:\  \   /:/|:|__|__   /::\~\:\  \       /::\  \   /::\~\:\  \      /::\__\  /:/  \:\  \
     * __/:/\/__/ /\ \:\ \ \__\ /:/__/ \:\__\ /:/ |::::\__\ /:/\:\ \:\__\     /:/\:\__\ /:/\:\ \:\__\  __/:/\/__/ /:/__/ \:\__\
     * /\/:/  /    \:\ \:\ \/__/ \:\  \ /:/  / \/__/~~/:/  / \:\~\:\ \/__/    /:/  \/__/ \/_|::\/:/  / /\/:/  /    \:\  \  \/__/
     * \::/__/      \:\ \:\__\    \:\  /:/  /        /:/  /   \:\ \:\__\     /:/  /         |:|::/  /  \::/__/      \:\  \
     * \:\__\       \:\/:/  /     \:\/:/  /        /:/  /     \:\ \/__/     \/__/          |:|\/__/    \:\__\       \:\  \
     * \/__/        \::/  /       \::/  /        /:/  /       \:\__\                      |:|  |       \/__/        \:\__\
     * \/__/         \/__/         \/__/         \/__/                       \|__|                     \/__/
     * }</pre>
     */
    public static final String ISOMETRIC1 = "isometric1";

    /**
     * {@code fonts/isometric2.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ___           ___           ___           ___                         ___                       ___
     * /\__\         /\  \         /\  \         /\__\                       /\  \                     /\__\
     * ___         /:/ _/_       /::\  \       |::\  \       /:/ _/_         ___         /::\  \       ___         /:/  /
     * /\__\       /:/ /\  \     /:/\:\  \      |:|:\  \     /:/ /\__\       /\__\       /:/\:\__\     /\__\       /:/  /
     * /:/__/      /:/ /::\  \   /:/  \:\  \   __|:|\:\  \   /:/ /:/ _/_     /:/  /      /:/ /:/  /    /:/__/      /:/  /  ___
     * /::\  \     /:/_/:/\:\__\ /:/__/ \:\__\ /::::|_\:\__\ /:/_/:/ /\__\   /:/__/      /:/_/:/__/___ /::\  \     /:/__/  /\__\
     * \/\:\  \__  \:\/:/ /:/  / \:\  \ /:/  / \:\~~\  \/__/ \:\/:/ /:/  /  /::\  \      \:\/:::::/  / \/\:\  \__  \:\  \ /:/  /
     * ~~\:\/\__\  \::/ /:/  /   \:\  /:/  /   \:\  \        \::/_/:/  /  /:/\:\  \      \::/~~/~~~~   ~~\:\/\__\  \:\  /:/  /
     * \::/  /   \/_/:/  /     \:\/:/  /     \:\  \        \:\/:/  /   \/__\:\  \      \:\~~\          \::/  /   \:\/:/  /
     * /:/  /      /:/  /       \::/  /       \:\__\        \::/  /         \:\__\      \:\__\         /:/  /     \::/  /
     * \/__/       \/__/         \/__/         \/__/         \/__/           \/__/       \/__/         \/__/       \/__/
     * }</pre>
     */
    public static final String ISOMETRIC2 = "isometric2";

    /**
     * {@code fonts/isometric3.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ___           ___           ___           ___                       ___                       ___
     * ___          /  /\         /  /\         /__/\         /  /\          ___        /  /\        ___          /  /\
     * /  /\        /  /:/_       /  /::\       |  |::\       /  /:/_        /  /\      /  /::\      /  /\        /  /:/
     * /  /:/       /  /:/ /\     /  /:/\:\      |  |:|:\     /  /:/ /\      /  /:/     /  /:/\:\    /  /:/       /  /:/
     * /__/::\      /  /:/ /::\   /  /:/  \:\   __|__|:|\:\   /  /:/ /:/_    /  /:/     /  /:/~/:/   /__/::\      /  /:/  ___
     * \__\/\:\__  /__/:/ /:/\:\ /__/:/ \__\:\ /__/::::| \:\ /__/:/ /:/ /\  /  /::\    /__/:/ /:/___ \__\/\:\__  /__/:/  /  /\
     * \  \:\/\ \  \:\/:/~/:/ \  \:\ /  /:/ \  \:\~~\__\/ \  \:\/:/ /:/ /__/:/\:\   \  \:\/:::::/    \  \:\/\ \  \:\ /  /:/
     * \__\::/  \  \::/ /:/   \  \:\  /:/   \  \:\        \  \::/ /:/  \__\/  \:\   \  \::/~~~~      \__\::/  \  \:\  /:/
     * /__/:/    \__\/ /:/     \  \:\/:/     \  \:\        \  \:\/:/        \  \:\   \  \:\          /__/:/    \  \:\/:/
     * \__\/       /__/:/       \  \::/       \  \:\        \  \::/          \__\/    \  \:\         \__\/      \  \::/
     * \__\/         \__\/         \__\/         \__\/                     \__\/                     \__\/
     * }</pre>
     */
    public static final String ISOMETRIC3 = "isometric3";

    /**
     * {@code fonts/isometric4.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ___           ___           ___           ___                         ___                        ___
     * ___        /  /\         /  /\         /  /\         /  /\          ___          /  /\           ___        /  /\
     * /__/\      /  /::\       /  /::\       /  /::|       /  /::\        /__/\        /  /::\         /__/\      /  /::\
     * \__\:\    /__/:/\:\     /  /:/\:\     /  /:|:|      /  /:/\:\       \  \:\      /  /:/\:\        \__\:\    /  /:/\:\
     * /  /::\  _\_ \:\ \:\   /  /:/  \:\   /  /:/|:|__   /  /::\ \:\       \__\:\    /  /::\ \:\       /  /::\  /  /:/  \:\
     * __/  /:/\/ /__/\ \:\ \:\ /__/:/ \__\:\ /__/:/_|::::\ /__/:/\:\ \:\      /  /::\  /__/:/\:\_\:\   __/  /:/\/ /__/:/ \  \:\
     * /__/\/:/~~  \  \:\ \:\_\/ \  \:\ /  /:/ \__\/  /~~/:/ \  \:\ \:\_\/     /  /:/\:\ \__\/~|::\/:/  /__/\/:/~~  \  \:\  \__\/
     * \  \::/      \  \:\_\:\    \  \:\  /:/        /  /:/   \  \:\ \:\      /  /:/__\/    |  |:|::/   \  \::/      \  \:\
     * \  \:\       \  \:\/:/     \  \:\/:/        /  /:/     \  \:\_\/     /__/:/         |  |:|\/     \  \:\       \  \:\
     * \__\/        \  \::/       \  \::/        /__/:/       \  \:\       \__\/          |__|:|~       \__\/        \  \:\
     * \__\/         \__\/         \__\/         \__\/                       \__\|                      \__\/
     * }</pre>
     */
    public static final String ISOMETRIC4 = "isometric4";

    /**
     * {@code fonts/italic.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     *
     * /_/_ /'_
     * ( /(/(/(
     *
     * }</pre>
     */
    public static final String ITALIC = "italic";

    /**
     * {@code fonts/jazmine.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     *
     * o                        o
     * 8
     * 8 .oPYo. .oooo. ooYoYo. o8 odYo. .oPYo.
     * 8 .oooo8   .dP  8' 8  8  8 8' `8 8oooo8
     * 8 8    8  oP'   8  8  8  8 8   8 8.
     * oP' `YooP8 `Yooo' 8  8  8  8 8   8 `Yooo'
     * ...::.....::.....:..:..:..:....::..:.....:
     * ::::::::::::::::::::::::::::::::::::::::::
     * ::::::::::::::::::::::::::::::::::::::::::
     * }</pre>
     */
    public static final String JAZMINE = "jazmine";

    /**
     * {@code fonts/jerusalem.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     *
     * __   __. ______  _______  _   _   _  _______  ___  ______  ______      _
     * \ \ / / |____  ||____  .|| | | | | ||____   ||_  ||____  ||____  |    | |
     * \ V /    _  | |     | | | | | | | |     | |   | |     | |  _  | | _  | |
     * ___\  \   | | |_|     | | | |/ /_/ /      | |   | |     | | | | |_|| |_| |
     * |______|   | |         | | |_______/       |_|   |_|     |_| | |     \___/
     * |_|         |_|                                   |_|
     * }</pre>
     */
    public static final String JERUSALEM = "jerusalem";

    /**
     * {@code fonts/js_block_letters.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * __   ____ _____  _     ____  ____  __  __  _     ____  _____  _____  ____ _____   ____
     * __) | (_ (_`| () )| |__ / () \/ (__`|  |/  /| |__ | ===||_   _||_   _|| ===|| () ) (_ (_`
     * \___/.__)__)|_()_)|____|\____/\____)|__|\__\|____||____|  |_|    |_|  |____||_|\_\.__)__)
     * }</pre>
     */
    public static final String JS_BLOCK_LETTERS = "js_block_letters";

    /**
     * {@code fonts/js_bracket_letters.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * .-. .----..----. .----.   .--.   .---. .-. .-..----..---. .-.   .----..---.  .---. .----..----.  .----.
     * .-.| |{ {__  | {}  }| {}  } / {} \ /  ___}| |/ / | {_ {_   _}| |   | {_ {_   _}{_   _}| {_  | {}  }{ {__
     * | {} |.-._} }| {}  }| .-. \/  /\  \\     }| |\ \ | {__  | |  | `--.| {__  | |    | |  | {__ | .-. \.-._} }
     * `----'`----' `----' `-' `-'`-'  `-' `---' `-' `-'`----' `-'  `----'`----' `-'    `-'  `----'`-' `-'`----'
     * }</pre>
     */
    public static final String JS_BRACKET_LETTERS = "js_bracket_letters";

    /**
     * {@code fonts/js_capital_curves.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ____, ____ _ ____   ___,   ___, ____, ____, ___,   __   _ ____   __   _, ___,   __  _, ____, ____
     * (-|   (-(__` (-/  ` (-|_\_,(-|_)(-|   (-|   (-|_\_,(-|    (-/  ` (-|  |  (-|_)  (-\ |  (-|_, (-(__`
     * _ |    ____)   \___, _|  )  _|   _|__, _|    _|  )  _|__,   \___,  |__|_, _| \_,   \|   _|__, ____)
     * (__/   (             (      (    (     (     (      (                     (             (     (
     * }</pre>
     */
    public static final String JS_CAPITAL_CURVES = "js_capital_curves";

    /**
     * {@code fonts/js_cursive.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     *
     * .  ,    __        ,_   ,    ._,     _
     * _/__/_)__(_,__(_/__/ (__/_)__/_ (_/__(/_
     * _/_
     * (/
     *
     * }</pre>
     */
    public static final String JS_CURSIVE = "js_cursive";

    /**
     * {@code fonts/js_stick_letters.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * __       __  ___    __                 ___ ___ ___  ___  __   __
     * | /__`     /__`  |  | /  ` |__/     |    |__   |   |  |__  |__) /__`
     * \__/ .__/ ___ .__/  |  | \__, |  \ ___ |___ |___  |   |  |___ |  \ .__/
     *
     * }</pre>
     */
    public static final String JS_STICK_LETTERS = "js_stick_letters";

    /**
     * {@code fonts/katakana.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * #    #   #             #     #                   #          ######   #
     * ########## #   ###    #######  #   ###    ######   #   ###             #   ###
     * #    #   ####        # #     ####            #   ####     ########## ####
     * #   #           # #     #               #   #        #        # #
     * #    #        ########## #               #   #               ##  #
     * #     #             #     #        ########## #             ##    #
     * #        #######      #      #######             #######    ##       #######
     *
     * }</pre>
     */
    public static final String KATAKANA = "katakana";

    /**
     * {@code fonts/kban.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * '||'  |'  '||
     * || .'     || ...   ....   .. ...
     * ||'|.     ||'  || '' .||   ||  ||
     * ||  ||    ||    | .|' ||   ||  ||
     * .||.  ||.  '|...'  '|..'|' .||. ||.
     *
     *
     * }</pre>
     */
    public static final String KBAN = "kban";

    /**
     * {@code fonts/keyboard.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     *
     * _______  _______  _______  _______  _______  _______  _______  _______
     * |\     /||\     /||\     /||\     /||\     /||\     /||\     /||\     /|
     * | +---+ || +---+ || +---+ || +---+ || +---+ || +---+ || +---+ || +---+ |
     * | |   | || |   | || |   | || |   | || |   | || |   | || |   | || |   | |
     * | |K  | || |e  | || |y  | || |b  | || |o  | || |a  | || |r  | || |d  | |
     * | +---+ || +---+ || +---+ || +---+ || +---+ || +---+ || +---+ || +---+ |
     * |/_____\||/_____\||/_____\||/_____\||/_____\||/_____\||/_____\||/_____\|
     *
     * }</pre>
     */
    public static final String KEYBOARD = "keyboard";

    /**
     * {@code fonts/knob.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * _________  _________  _________  _________
     * (___    __)(______  _)(  _____  )(  _   _  )
     * __/ __ \_  _____/ /_ | |_____| || |_| |_| |
     * (___/  \__)(_________)(_________)(____/\___)
     * }</pre>
     */
    public static final String KNOB = "knob";

    /**
     * {@code fonts/konto.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * I,� ,�`. I`.I ��T�� ,�`.
     * I`. `..' I `I   I   `..'
     * }</pre>
     */
    public static final String KONTO = "konto";

    /**
     * {@code fonts/kontoslant.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * /.�  /�/  /1 / �/�  /�/  /��  /  /1  /1 / �/�
     * /�.  /./  / 1/  /   /./  ../  /. /�/ / 1/  /
     * }</pre>
     */
    public static final String KONTOSLANT = "kontoslant";

    /**
     * {@code fonts/konto_slant.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * /.�  /�/  /1 / �/�  /�/ _ /��  /  /1  /1 / �/�
     * /�.  /./  / 1/  /   /./   ../  /. /�/ / 1/  /
     * }</pre>
     */
    public static final String KONTO_SLANT = "konto_slant";

    /**
     * {@code fonts/larry3d.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * __                                              __       __
     * /\ \                                           /'__`\    /\ \
     * \ \ \         __      _ __   _ __   __  __    /\_\L\ \   \_\ \
     * \ \ \  __  /'__`\   /\`'__\/\`'__\/\ \/\ \   \/_/_\_<_  /'_` \
     * \ \ \L\ \/\ \L\.\_ \ \ \/ \ \ \/ \ \ \_\ \    /\ \L\ \/\ \L\ \
     * \ \____/\ \__/.\_\ \ \_\  \ \_\  \/`____ \   \ \____/\ \___,_\
     * \/___/  \/__/\/_/  \/_/   \/_/   `/___/> \   \/___/  \/__,_ /
     * /\___/
     * \/__/
     * }</pre>
     */
    public static final String LARRY3D = "larry3d";

    /**
     * {@code fonts/larry_3d.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * __                                                        __       __
     * /\ \                                                     /'__`\    /\ \
     * \ \ \         __      _ __   _ __   __  __              /\_\L\ \   \_\ \
     * \ \ \  __  /'__`\   /\`'__\/\`'__\/\ \/\ \             \/_/_\_<_  /'_` \
     * \ \ \L\ \/\ \L\.\_ \ \ \/ \ \ \/ \ \ \_\ \              /\ \L\ \/\ \L\ \
     * \ \____/\ \__/.\_\ \ \_\  \ \_\  \/`____ \             \ \____/\ \___,_\
     * \/___/  \/__/\/_/  \/_/   \/_/   `/___/> \  _______    \/___/  \/__,_ /
     * /\___/ /\______\
     * \/__/  \/______/
     * }</pre>
     */
    public static final String LARRY_3D = "larry_3d";

    /**
     * {@code fonts/larry_3d_2.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * __                                                        __       __                  ___
     * /\ \                                                     /'__`\    /\ \               /'___`\
     * \ \ \         __      _ __   _ __   __  __              /\_\L\ \   \_\ \             /\_\ /\ \
     * \ \ \  __  /'__`\   /\`'__\/\`'__\/\ \/\ \             \/_/_\_<_  /'_` \            \/_/// /__
     * \ \ \L\ \/\ \L\.\_ \ \ \/ \ \ \/ \ \ \_\ \              /\ \L\ \/\ \L\ \              // /_\ \
     * \ \____/\ \__/.\_\ \ \_\  \ \_\  \/`____ \             \ \____/\ \___,_\            /\______/
     * \/___/  \/__/\/_/  \/_/   \/_/   `/___/> \  _______    \/___/  \/__,_ /  _______   \/_____/
     * /\___/ /\______\                    /\______\
     * \/__/  \/______/                    \/______/
     * }</pre>
     */
    public static final String LARRY_3D_2 = "larry_3d_2";

    /**
     * {@code fonts/lcd.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     *
     * |               |
     * |      -       -|
     * |     |       | |
     * ---   -       -
     *
     * }</pre>
     */
    public static final String LCD = "lcd";

    /**
     * {@code fonts/letters.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * LL             tt    tt
     * LL        eee  tt    tt      eee  rr rr   sss
     * LL      ee   e tttt  tttt  ee   e rrr  r s
     * LL      eeeee  tt    tt    eeeee  rr      sss
     * LLLLLLL  eeeee  tttt  tttt  eeeee rr         s
     * sss
     * }</pre>
     */
    public static final String LETTERS = "letters";

    /**
     * {@code fonts/lildevil.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * _             _(`-')    (`-')  _      (`-')  _
     * <-.    (_)      <-.  ( (OO ).-> ( OO).-/     _(OO ) (_)      <-.
     * ,--. )   ,-(`-'),--. )  \    .'_ (,------.,--.(_/,-.\ ,-(`-'),--. )
     * |  (`-') | ( OO)|  (`-')'`'-..__) |  .---'\   \ / (_/ | ( OO)|  (`-')
     * |  |OO ) |  |  )|  |OO )|  |  ' |(|  '--.  \   /   /  |  |  )|  |OO )
     * (|  '__ |(|  |_/(|  '__ ||  |  / : |  .--' _ \     /_)(|  |_/(|  '__ |
     * |     |' |  |'->|     |'|  '-'  / |  `---.\-'\   /    |  |'->|     |'
     * `-----'  `--'   `-----' `------'  `------'    `-'     `--'   `-----'
     * }</pre>
     */
    public static final String LILDEVIL = "lildevil";

    /**
     * {@code fonts/lil_devil.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * _                      _(`-')    (`-')  _      (`-')  _
     * <-.    (_)      <-.           ( (OO ).-> ( OO).-/     _(OO ) (_)      <-.
     * ,--. )   ,-(`-'),--. )           \    .'_ (,------.,--.(_/,-.\ ,-(`-'),--. )
     * |  (`-') | ( OO)|  (`-')         '`'-..__) |  .---'\   \ / (_/ | ( OO)|  (`-')
     * |  |OO ) |  |  )|  |OO )   (`-') |  |  ' |(|  '--.  \   /   /  |  |  )|  |OO )
     * (|  '__ |(|  |_/(|  '__ |<-.(OO ) |  |  / : |  .--' _ \     /_)(|  |_/(|  '__ |
     * |     |' |  |'->|     |',------.)|  '-'  / |  `---.\-'\   /    |  |'->|     |'
     * `-----'  `--'   `-----' `------' `------'  `------'    `-'     `--'   `-----'
     * }</pre>
     */
    public static final String LIL_DEVIL = "lil_devil";

    /**
     * {@code fonts/lineblocks.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * _       _____  ______   ______  ______   _        ______   ______  _    __  ______
     * | |       | |  | |  \ \ | |     | |  | \ | |      / |  | \ | |     | |  / / / |
     * | |   _   | |  | |  | | | |---- | |--| < | |   _  | |  | | | |     | |-< <  '------.
     * |_|__|_| _|_|_ |_|  |_| |_|____ |_|__|_/ |_|__|_| \_|__|_/ |_|____ |_|  \_\  ____|_/
     *
     * }</pre>
     */
    public static final String LINEBLOCKS = "lineblocks";

    /**
     * {@code fonts/line_blocks.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * _       _____  ______   ______ _ ______   _        ______   ______  _    __  ______
     * | |       | |  | |  \ \ | |      | |  | \ | |      / |  | \ | |     | |  / / / |
     * | |   _   | |  | |  | | | |----  | |--| < | |   _  | |  | | | |     | |-< <  '------.
     * |_|__|_| _|_|_ |_|  |_| |_|____  |_|__|_/ |_|__|_| \_|__|_/ |_|____ |_|  \_\  ____|_/
     *
     * }</pre>
     */
    public static final String LINE_BLOCKS = "line_blocks";

    /**
     * {@code fonts/linux.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * .-.   .-..-..-..-..-..-..-.
     * | |__ | || .` || || | >  <
     * `----'`-'`-'`-'`----''-'`-`
     *
     * }</pre>
     */
    public static final String LINUX = "linux";

    /**
     * {@code fonts/lockergnome.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ::|              :|
     * ::|    ,::\ .::/ :|_/ :~~/ :::| /::| :::\ ,::\ :\/| :~~/
     * ::::::|`::/ `::\ :|~\ :::, :|   \::| :|:| `::/ :::| :::,
     * ,.:/
     * }</pre>
     */
    public static final String LOCKERGNOME = "lockergnome";

    /**
     * {@code fonts/madrid.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * /\/\       |        |
     * |==| /=| /=| /= = /=|
     * \  / \=| \=| |  | \=|
     *
     * }</pre>
     */
    public static final String MADRID = "madrid";

    /**
     * {@code fonts/marquee.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * .::       .::
     * .: .::   .:::
     * .:: .:: . .::   .::    .: .:::  .::   .::  .::   .::       .::
     * .::  .::  .:: .::  .::  .::   .:  .:: .::  .:: .:   .::  .:   .::
     * .::   .:  .::.::   .::  .::   .:  .:: .::  .::.::::: .::.::::: .::
     * .::       .::.::   .::  .::    .::.:: .::  .::.:        .:
     * .::       .::  .:: .:::.:::       .::   .::.::  .::::     .::::
     * .:::
     * }</pre>
     */
    public static final String MARQUEE = "marquee";

    /**
     * {@code fonts/maxfour.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * |\  /|       /~\
     * | \/ |/~~|\/-|-/~\|   ||/~\
     * |    |\__|/\ | \_/ \_/||
     *
     * }</pre>
     */
    public static final String MAXFOUR = "maxfour";

    /**
     * {@code fonts/merlin1.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ___      ___   _______   _______   ___        __    _____  ___    ____
     * |"  \    /"  | /"     "| /"      \ |"  |      |" \  (\"   \|"  \  /  " \
     * \   \  //   |(: ______)|:        |||  |      ||  | |.\\   \    |/__|| |
     * /\\  \/.    | \/    |  |_____/   )|:  |      |:  | |: \.   \\  |   |: |
     * |: \.        | // ___)_  //      /  \  |___   |.  | |.  \    \. |  _\  |
     * |.  \    /:  |(:      "||:  __   \ ( \_|:  \  /\  |\|    \    \ | /" \_|\
     * |___|\__/|___| \_______)|__|  \___) \_______)(__\_|_)\___|\____\)(_______)
     *
     * }</pre>
     */
    public static final String MERLIN1 = "merlin1";

    /**
     * {@code fonts/merlin2.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * _               _        _         _          _      _          _
     * _/\\___ _____  __/\\___  _/\\___   _/\\_      _/\\_  _/\\___   __//\
     * (_      v    ))(_  ____))(_   _  ))(_  _))    (____))(_      ))//    \
     * /  :   <\   \\ /  ._))   /  |))//  /  \\      /  \\  /  :   \\\\_/  /
     * /:. |   //   ///:. ||___ /:.    \\ /:.  \\__  /:.  \\/:. |   //  /.:/_/\\
     * \___|  //\  // \  _____))\___|  // \__  ____))\__  //\___|  //   \  ___//
     * \//  \//   \//           \//     \//        \//      \//     \//
     *
     *
     * }</pre>
     */
    public static final String MERLIN2 = "merlin2";

    /**
     * {@code fonts/mike.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * |/  _
     * ||\ _|  |  |/
     *
     * }</pre>
     */
    public static final String MIKE = "mike";

    /**
     * {@code fonts/mirror.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * _  __  __
     * __ _   ___   __ _  __ _ (_)|  \/  |
     * |__` | / _ \ |__` ||__` || || |\/| |
     * | || (_) |   | |   | || || |  | |
     * |_| \___/    |_|   |_||_||_|  |_|
     *
     * }</pre>
     */
    public static final String MIRROR = "mirror";

    /**
     * {@code fonts/modular.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * __   __  _______  ______   __   __  ___      _______  ______
     * |  |_|  ||       ||      | |  | |  ||   |    |   _   ||    _ |
     * |       ||   _   ||  _    ||  | |  ||   |    |  |_|  ||   | ||
     * |       ||  | |  || | |   ||  |_|  ||   |    |       ||   |_||_
     * |       ||  |_|  || |_|   ||       ||   |___ |       ||    __  |
     * | ||_|| ||       ||       ||       ||       ||   _   ||   |  | |
     * |_|   |_||_______||______| |_______||_______||__| |__||___|  |_|
     * }</pre>
     */
    public static final String MODULAR = "modular";

    /**
     * {@code fonts/morse.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * -- --- .-. ... .
     * }</pre>
     */
    public static final String MORSE = "morse";

    /**
     * {@code fonts/morse2.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * -- --- .-. ... . ..---
     * }</pre>
     */
    public static final String MORSE2 = "morse2";

    /**
     * {@code fonts/moscow.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     *
     * #   #  ###   #### #   #  ###  #   #
     * ## ## #   # #     #   # #   # # # #
     * # # # #   # #      #### #   # # # #
     * #   # #   # #         # #   # # # #
     * #   #  ###   ####     #  ###   ###
     * }</pre>
     */
    public static final String MOSCOW = "moscow";

    /**
     * {@code fonts/mshebrew210.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     *
     * ""|""| |""||""|'
     * | '  |_|| '   |
     * |       |
     * }</pre>
     */
    public static final String MSHEBREW210 = "mshebrew210";

    /**
     * {@code fonts/muzzle.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * __
     * |\ /| |  | >>> >>> |   |
     * | < | |  |  /   /  |   |<<
     * |   | '<<' /<< /<< |<< |__
     * }</pre>
     */
    public static final String MUZZLE = "muzzle";

    /**
     * {@code fonts/nancyj.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * 888888ba                                      oo
     * 88    `8b
     * 88     88 .d8888b. 88d888b. .d8888b. dP    dP dP
     * 88     88 88'  `88 88'  `88 88'  `"" 88    88 88
     * 88     88 88.  .88 88    88 88.  ... 88.  .88 88
     * dP     dP `88888P8 dP    dP `88888P' `8888P88 88
     * .88 88
     * d8888P  dP
     * }</pre>
     */
    public static final String NANCYJ = "nancyj";

    /**
     * {@code fonts/nancyj_fancy.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * M"""""""`YM                                     oo              .8888b
     * M  mmmm.  M                                                     88   "
     * M  MMMMM  M .d8888b. 88d888b. .d8888b. dP    dP dP              88aaa  .d8888b. 88d888b. .d8888b. dP    dP
     * M  MMMMM  M 88'  `88 88'  `88 88'  `"" 88    88 88              88     88'  `88 88'  `88 88'  `"" 88    88
     * M  MMMMM  M 88.  .88 88    88 88.  ... 88.  .88 88              88     88.  .88 88    88 88.  ... 88.  .88
     * M  MMMMM  M `88888P8 dP    dP `88888P' `8888P88 88              dP     `88888P8 dP    dP `88888P' `8888P88
     * MMMMMMMMMMM                                 .88 88 oooooooooooo                                        .88
     * d8888P  dP                                                 d8888P
     * }</pre>
     */
    public static final String NANCYJ_FANCY = "nancyj_fancy";

    /**
     * {@code fonts/nancyj_improved.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * 888888ba                                      oo              oo                                                               dP
     * 88    `8b                                                                                                                      88
     * 88     88 .d8888b. 88d888b. .d8888b. dP    dP dP              dP 88d8b.d8b. 88d888b. 88d888b. .d8888b. dP   .dP .d8888b. .d888b88
     * 88     88 88'  `88 88'  `88 88'  `"" 88    88 88              88 88'`88'`88 88'  `88 88'  `88 88'  `88 88   d8' 88ooood8 88'  `88
     * 88     88 88.  .88 88    88 88.  ... 88.  .88 88              88 88  88  88 88.  .88 88       88.  .88 88 .88'  88.  ... 88.  .88
     * dP     dP `88888P8 dP    dP `88888P' `8888P88 88              dP dP  dP  dP 88Y888P' dP       `88888P' 8888P'   `88888P' `88888P8
     * .88 88 oooooooooooo               88
     * d8888P  dP                            dP
     * }</pre>
     */
    public static final String NANCYJ_IMPROVED = "nancyj_improved";

    /**
     * {@code fonts/nancyj_underlined.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * 888888ba                                      oo                                      dP                   dP oo                         dP
     * 88    `8b                                                                             88                   88                            88
     * 88     88 .d8888b. 88d888b. .d8888b. dP    dP dP              dP    dP 88d888b. .d888b88 .d8888b. 88d888b. 88 dP 88d888b. .d8888b. .d888b88
     * 88     88 88'  `88 88'  `88 88'  `"" 88    88 88              88    88 88'  `88 88'  `88 88ooood8 88'  `88 88 88 88'  `88 88ooood8 88'  `88
     * 88     88 88.  .88 88    88 88.  ... 88.  .88 88              88.  .88 88    88 88.  .88 88.  ... 88       88 88 88    88 88.  ... 88.  .88
     * dP     dP `88888P8 dP    dP `88888P' `8888P88 88              `88888P' dP    dP `88888P8 `88888P' dP       dP dP dP    dP `88888P' `88888P8
     * oooooooooooooooooooooooooooooooooooooo~~~~.88~88~ vvvvvvvvvvv oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo
     * d8888P  dP  """""""""""
     * }</pre>
     */
    public static final String NANCYJ_UNDERLINED = "nancyj_underlined";

    /**
     * {@code fonts/nipples.flf}
     *
     * <p>Example:
     *
     * <pre>
     * {___     {__                    {__
     * {_ {__   {__ {_                 {__
     * {__ {__  {__   {_ {__  {_ {__   {__   {__     {____
     * {__  {__ {__{__{_  {__ {_  {__  {__ {_   {__ {__
     * {__   {_ {__{__{_   {__{_   {__ {__{_____ {__  {___
     * {__    {_ __{__{__ {__ {__ {__  {__{_            {__
     * {__      {__{__{__     {__     {___  {____   {__ {__
     * {__     {__
     *
     * </pre>
     */
    public static final String NIPPLES = "nipples";

    /**
     * {@code fonts/nscript.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ,ggg, ,ggggggg,
     * dP""Y8,8P"""""Y8b                                                     I8
     * Yb, `8dP'     `88                                                     I8
     * `"  88'       88                                  gg              88888888
     * 88        88                                  ""                 I8
     * 88        88    ,g,       ,gggg,   ,gggggg,   gg   gg,gggg,      I8
     * 88        88   ,8'8,     dP"  "Yb  dP""""8I   88   I8P"  "Yb     I8
     * 88        88  ,8'  Yb   i8'       ,8'    8I   88   I8'    ,8i   ,I8,
     * 88        Y8,,8'_   8) ,d8,_    _,dP     Y8,_,88,_,I8 _  ,d8'  ,d88b,
     * 88        `Y8P' "YY8P8PP""Y8888PP8P      `Y88P""Y8PI8 YY88888P88P""Y88
     * I8
     * I8
     * I8
     * I8
     * I8
     * I8
     * }</pre>
     */
    public static final String NSCRIPT = "nscript";

    /**
     * {@code fonts/ntgreek.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     *
     * _   _
     * | \ | |
     * |  \| | ___  _   _   ___   ___  ___  _  __
     * |     |(   )( \ / ) / _ \ / __)/ __)| |/ /
     * | |\  | | |  \ v / | |_) )> _) > _) |   <
     * |_| \_|  \_)  | |  |  __/ \___)\___)|_|\_\
     * | |  | |
     * |_|  |_|
     * }</pre>
     */
    public static final String NTGREEK = "ntgreek";

    /**
     * {@code fonts/nt_greek.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     *
     * _   _
     * | \ | |
     * |  \| | ___    _   _   ___   ___  ___  _  __
     * |     |(   )  ( \ / ) / _ \ / __)/ __)| |/ /
     * | |\  | | |    \ v / | |_) )> _) > _) |   <
     * |_| \_|  \_)    | |  |  __/ \___)\___)|_|\_\
     * | |  | |
     * ||  |_|  |_|
     * }</pre>
     */
    public static final String NT_GREEK = "nt_greek";

    /**
     * {@code fonts/nv_script.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ,ggg, ,ggggggg,
     * dP""Y8,8P"""""Y8b                                                                   I8
     * Yb, `8dP'     `88                                                                   I8
     * `"  88'       88                                                 gg             88888888
     * 88        88                                                 ""                I8
     * 88        88     ggg    gg     ,g,       ,gggg,   ,gggggg,   gg   gg,gggg,     I8
     * 88        88    d8"Yb   88bg  ,8'8,     dP"  "Yb  dP""""8I   88   I8P"  "Yb    I8
     * 88        88   dP  I8   8I   ,8'  Yb   i8'       ,8'    8I   88   I8'    ,8i  ,I8,
     * 88        Y8,,dP   I8, ,8I  ,8'_   8) ,d8,_    _,dP     Y8,_,88,_,I8 _  ,d8' ,d88b,
     * 88        `Y88"     "Y8P"   P' "YY8P8PP""Y8888PP8P      `Y88P""Y8PI8 YY88888P8P""Y8
     * I8
     * I8
     * I8
     * I8
     * I8
     * I8
     * }</pre>
     */
    public static final String NV_SCRIPT = "nv_script";

    /**
     * {@code fonts/o8.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ooooooo     ooooooo
     * o888   888o o888   888o
     * 888     888  888888888
     * 888o   o888 888o   o888
     * 88ooo88     88ooo88
     *
     * }</pre>
     */
    public static final String O8 = "o8";

    /**
     * {@code fonts/octal.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * 117 143 164 141 154
     * }</pre>
     */
    public static final String OCTAL = "octal";

    /**
     * {@code fonts/ogre.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ___
     * /___\  __ _  _ __   ___
     * //  // / _` || '__| / _ \
     * / \_// | (_| || |   |  __/
     * \___/   \__, ||_|    \___|
     * |___/
     * }</pre>
     */
    public static final String OGRE = "ogre";

    /**
     * {@code fonts/oldbanner.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * #######
     * #     # #      #####  #####    ##   #    # #    # ###### #####
     * #     # #      #    # #    #  #  #  ##   # ##   # #      #    #
     * #     # #      #    # #####  #    # # #  # # #  # #####  #    #
     * #     # #      #    # #    # ###### #  # # #  # # #      #####
     * #     # #      #    # #    # #    # #   ## #   ## #      #   #
     * ####### ###### #####  #####  #    # #    # #    # ###### #    #
     * }</pre>
     */
    public static final String OLDBANNER = "oldbanner";

    /**
     * {@code fonts/old_banner.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * #######
     * #     # #      #####          #####    ##   #    # #    # ###### #####
     * #     # #      #    #         #    #  #  #  ##   # ##   # #      #    #
     * #     # #      #    #         #####  #    # # #  # # #  # #####  #    #
     * #     # #      #    #         #    # ###### #  # # #  # # #      #####
     * #     # #      #    #         #    # #    # #   ## #   ## #      #   #
     * ####### ###### #####  ####### #####  #    # #    # #    # ###### #    #
     * }</pre>
     */
    public static final String OLD_BANNER = "old_banner";

    /**
     * {@code fonts/os2.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ___oooo_____________ooooo__
     * _oo____oo___oooo__oo____oo_
     * oo______oo_oo___o_______oo_
     * oo______oo___oo_______ooo__
     * _oo____oo__o___oo___ooo____
     * ___oooo_____oooo__oooooooo_
     * ___________________________
     * }</pre>
     */
    public static final String OS2 = "os2";

    /**
     * {@code fonts/patorjk's_cheese.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     *
     * _____          ____   _________________       _____         _____           ____  ____    ____           ______        _____    ____   ____      ______        ______            ______       ______
     * ___|\    \    ____|\   \ /                 \ ____|\    \    ___|\    \         |    ||    |  |    |      ___|\     \   ___|\    \  |    | |    | ___|\     \   ___|\     \       ___|\     \  ___|\     \
     * |    |\    \  /    /\    \\______     ______//     /\    \  |    |\    \        |    ||    |  |    |     |    |\     \ /    /\    \ |    | |    ||     \     \ |     \     \     |    |\     \|     \     \
     * |    | |    ||    |  |    |  \( /    /  )/  /     /  \    \ |    | |    |       |    ||    | /    //     |    |/____/||    |  |    ||    |_|    ||     ,_____/||     ,_____/|    |    |/____/||     ,_____/|
     * |    |/____/||    |__|    |   ' |   |   '  |     |    |    ||    |/____/  ____  |    ||    |/ _ _//   ___|    \|   | ||    |  |____||    .-.    ||     \--'\_|/|     \--'\_|/ ___|    \|   | ||     \--'\_|/
     * |    ||    |||    .--.    |     |   |      |     |    |    ||    |\    \ |    | |    ||    |\    \'  |    \    \___|/ |    |   ____ |    | |    ||     /___/|  |     /___/|  |    \    \___|/ |     /___/|
     * |    ||____|/|    |  |    |    /   //      |\     \  /    /||    | |    ||    | |    ||    | \    \  |    |\     \    |    |  |    ||    | |    ||     \____|\ |     \____|\ |    |\     \    |     \____|\
     * |____|       |____|  |____|   /___//       | \_____\/____/ ||____| |____||\____\|____||____|  \____\ |\ ___\|_____|   |\ ___\/    /||____| |____||____ '     /||____ '     /||\ ___\|_____|   |____ '     /|
     * |    |       |    |  |    |  |`   |         \ |    ||    | /|    | |    || |    |    ||    |   |    || |    |     |   | |   /____/ ||    | |    ||    /_____/ ||    /_____/ || |    |     |   |    /_____/ |
     * |____|       |____|  |____|  |____|          \|____||____|/ |____| |____| \|____|____||____|   |____| \|____|_____|    \|___|    | /|____| |____||____|     | /|____|     | / \|____|_____|   |____|     | /
     * \(           \(      )/      \(               \(    )/      \(     )/      \(   )/    \(       )/      \(    )/        \( |____|/   \(     )/    \( |_____|/   \( |_____|/     \(    )/       \( |_____|/
     * '            '      '        '                '    '        '     '        '   '      '       '        '    '          '   )/       '     '      '    )/       '    )/         '    '         '    )/
     * '                          '             '                              '
     * }</pre>
     */
    public static final String PATORJKS_CHEESE = "patorjk's_cheese";

    /**
     * {@code fonts/patorjk_hex.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ______                                                                                                                                             _____
     * _____|\     \     _____       ________    ________         ____     ___________               _____    ______   _______          __     __          _____\    \ _____       _____
     * /     / |     |  /      |_    /        \  /        \    ____\_  \__  \          \             |\    \_ |\     \  \      \        /  \   /  \        /    / |    |\    \     /    /
     * |      |/     /| /         \  |\         \/         /|  /     /     \  \    /\    \            \ \     \ \\     \  |     /|      /   /| |\   \      /    /  /___/| \    |   |    /
     * |      |\____/ ||     /\    \ | \            /\____/ | /     /\      |  |   \_\    |            \|      | \|     |/     //      /   //   \\   \    |    |__ |___|/  \    \ /    /
     * |\     \    | / |    |  |    \|  \______/\   \     | ||     |  |     |  |      ___/              |      |  |     |_____//      /    \_____/    \   |       \         \    |    /
     * | \     \___|/  |     \/      \\ |      | \   \____|/ |     |  |     |  |      \  ____   ______  |      |  |     |\     \     /    /\_____/\    \  |     __/ __      /    |    \
     * |  \     \      |\      /\     \\|______|  \   \      |     | /     /| /     /\ \/    \ /     / /      /| /     /|\|     |   /    //\_____/\\    \ |\    \  /  \    /    /|\    \
     * \  \_____\     | \_____\ \_____\        \  \___\     |\     \_____/ |/_____/ |\______||      |/______/ |/_____/ |/_____/|  /____/ |       | \____\| \____\/    |  |____|/ \|____|
     * \ |     |     | |     | |     |         \ |   |     | \_____\   | / |     | | |     ||\_____\      | /|     | / |    | |  |    | |       | |    || |    |____/|  |    |   |    |
     * \|_____|      \|_____|\|_____|          \|___|      \ |    |___|/  |_____|/ \|_____|| |     |_____|/ |_____|/  |____|/   |____|/         \|____| \|____|   | |  |____|   |____|
     * \|____|                         \|_____|                                                          |___|/
     * }</pre>
     */
    public static final String PATORJK_HEX = "patorjk_hex";

    /**
     * {@code fonts/pawp.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     *
     * _____
     * (_____)
     * (_)__(_)   ____  _   _   _  ____
     * (_____)   (____)(_) ( ) (_)(____)
     * (_)      ( )_( )(_)_(_)_(_)(_)_(_)
     * (_)       (__)_) (__) (__) (____)
     * (_)
     * (_)
     * }</pre>
     */
    public static final String PAWP = "pawp";

    /**
     * {@code fonts/peaks.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * /^^^^^^^                      /^^
     * /^^    /^^                    /^^
     * /^^    /^^   /^^       /^^    /^^  /^^ /^^^^
     * /^^^^^^^   /^   /^^  /^^  /^^ /^^ /^^ /^^
     * /^^       /^^^^^ /^^/^^   /^^ /^/^^     /^^^
     * /^^       /^        /^^   /^^ /^^ /^^     /^^
     * /^^         /^^^^     /^^ /^^^/^^  /^^/^^ /^^
     *
     * }</pre>
     */
    public static final String PEAKS = "peaks";

    /**
     * {@code fonts/peaksslant.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * _/\/\/\/\/\____________________________/\/\________________________________/\/\______________________________/\/\_____
     * _/\/\____/\/\____/\/\/\____/\/\/\______/\/\__/\/\____/\/\/\/\____/\/\/\/\__/\/\____/\/\/\______/\/\/\/\____/\/\/\/\/\_
     * _/\/\/\/\/\____/\/\/\/\/\______/\/\____/\/\/\/\____/\/\/\/\____/\/\/\/\____/\/\________/\/\____/\/\__/\/\____/\/\_____
     * _/\/\__________/\/\________/\/\/\/\____/\/\/\/\__________/\/\________/\/\__/\/\____/\/\/\/\____/\/\__/\/\____/\/\_____
     * _/\/\____________/\/\/\/\__/\/\/\/\/\__/\/\__/\/\__/\/\/\/\____/\/\/\/\____/\/\/\__/\/\/\/\/\__/\/\__/\/\____/\/\/\___
     * ______________________________________________________________________________________________________________________
     * }</pre>
     */
    public static final String PEAKSSLANT = "peaksslant";

    /**
     * {@code fonts/peaks_slant.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * _/\/\/\/\/\____________________________/\/\______________________________________________/\/\______________________________/\/\_____
     * _/\/\____/\/\____/\/\/\____/\/\/\______/\/\__/\/\____/\/\/\/\__________________/\/\/\/\__/\/\____/\/\/\______/\/\/\/\____/\/\/\/\/\_
     * _/\/\/\/\/\____/\/\/\/\/\______/\/\____/\/\/\/\____/\/\/\/\__________________/\/\/\/\____/\/\________/\/\____/\/\__/\/\____/\/\_____
     * _/\/\__________/\/\________/\/\/\/\____/\/\/\/\__________/\/\______________________/\/\__/\/\____/\/\/\/\____/\/\__/\/\____/\/\_____
     * _/\/\____________/\/\/\/\__/\/\/\/\/\__/\/\__/\/\__/\/\/\/\__________________/\/\/\/\____/\/\/\__/\/\/\/\/\__/\/\__/\/\____/\/\/\___
     * _______________________________________________________________/\/\/\/\/\/\_________________________________________________________
     * }</pre>
     */
    public static final String PEAKS_SLANT = "peaks_slant";

    /**
     * {@code fonts/pebbles.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * OooOOo.         o     o     o
     * O     `O       O     O     O
     * o      O       O     O     o
     * O     .o       o     o     O
     * oOooOO'  .oOo. OoOo. OoOo. o  .oOo. .oOo
     * o        OooO' O   o O   o O  OooO' `Ooo.
     * O        O     o   O o   O o  O         O
     * o'       `OoO' `OoO' `OoO' Oo `OoO' `OoO'
     *
     *
     * }</pre>
     */
    public static final String PEBBLES = "pebbles";

    /**
     * {@code fonts/pepper.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * _
     * /_/_  _  _  _  _
     * /  /_'/_//_//_'/
     * /  /
     * }</pre>
     */
    public static final String PEPPER = "pepper";

    /**
     * {@code fonts/poison.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     *
     * @@@@@@@    @@@@@@   @@@   @@@@@@    @@@@@@   @@@  @@@
     * @@@@@@@@  @@@@@@@@  @@@  @@@@@@@   @@@@@@@@  @@@@ @@@
     * @@!  @@@  @@!  @@@  @@!  !@@       @@!  @@@  @@!@!@@@
     * !@!  @!@  !@!  @!@  !@!  !@!       !@!  @!@  !@!!@!@!
     * @!@@!@!   @!@  !@!  !!@  !!@@!!    @!@  !@!  @!@ !!@!
     * !!@!!!    !@!  !!!  !!!   !!@!!!   !@!  !!!  !@!  !!!
     * !!:       !!:  !!!  !!:       !:!  !!:  !!!  !!:  !!!
     * :!:       :!:  !:!  :!:      !:!   :!:  !:!  :!:  !:!
     * ::       ::::: ::   ::  :::: ::   ::::: ::   ::   ::
     * :         : :  :   :    :: : :     : :  :   ::    :
     *
     * }</pre>
     */
    public static final String POISON = "poison";

    /**
     * {@code fonts/puffy.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ___             ___    ___
     * (  _`\         /'___) /'___)
     * | |_) ) _   _ | (__  | (__   _   _
     * | ,__/'( ) ( )| ,__) | ,__) ( ) ( )
     * | |    | (_) || |    | |    | (_) |
     * (_)    `\___/'(_)    (_)    `\__, |
     * ( )_| |
     * `\___/'
     * }</pre>
     */
    public static final String PUFFY = "puffy";

    /**
     * {@code fonts/puzzle.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * _         _         _         _         _         _
     * _( )__    _( )__    _( )__    _( )__    _( )__    _( )__
     * _|     _| _|     _| _|     _| _|     _| _|     _| _|     _|
     * (_ P _ (_ (_ U _ (_ (_ Z _ (_ (_ Z _ (_ (_ L _ (_ (_ E _ (_
     * |_( )__|  |_( )__|  |_( )__|  |_( )__|  |_( )__|  |_( )__|
     * }</pre>
     */
    public static final String PUZZLE = "puzzle";

    /**
     * {@code fonts/rammstein.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * _____
     * __|__   |__  ____    ____    __  ____    __  ______   __    ______  ____  ____   _
     * |     |     ||    \  |    \  /  ||    \  /  ||   ___|_|  |_ |   ___||    ||    \ | |
     * |     \     ||     \ |     \/   ||     \/   | `-.`-.|_    _||   ___||    ||     \| |
     * |__|\__\  __||__|\__\|__/\__/|__||__/\__/|__||______| |__|  |______||____||__/\____|
     * |_____|
     *
     * }</pre>
     */
    public static final String RAMMSTEIN = "rammstein";

    /**
     * {@code fonts/rectangles.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     *
     * _____            _                   _
     * | __  | ___  ___ | |_  ___  ___  ___ | | ___  ___
     * |    -|| -_||  _||  _|| .'||   || . || || -_||_ -|
     * |__|__||___||___||_|  |__,||_|_||_  ||_||___||___|
     * |___|
     * }</pre>
     */
    public static final String RECTANGLES = "rectangles";

    /**
     * {@code fonts/red_phoenix.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * __________               .___                  .__                                 .__
     * \______   \   ____     __| _/         ______   |  |__     ____     ____     ____   |__| ___  ___
     * |       _/ _/ __ \   / __ |          \____ \  |  |  \   /  _ \  _/ __ \   /    \  |  | \  \/  /
     * |    |   \ \  ___/  / /_/ |          |  |_> > |   Y  \ (  <_> ) \  ___/  |   |  \ |  |  >    <
     * |____|_  /  \___  > \____ |   ______ |   __/  |___|  /  \____/   \___  > |___|  / |__| /__/\_ \
     * \/       \/       \/  /_____/ |__|          \/                \/       \/             \/
     *
     * }</pre>
     */
    public static final String RED_PHOENIX = "red_phoenix";

    /**
     * {@code fonts/relief.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ______________________________________________________________
     * /~~~~~~~\__/~~~~~~~~\_/~~\_______/~~~~\_/~~~~~~~~\_/~~~~~~~~\_
     * /~~\__/~~\_/~~\_______/~~\________/~~\__/~~\_______/~~\_______
     * /~~~~~~~\__/~~~~~~\___/~~\________/~~\__/~~~~~~\___/~~~~~~\___
     * /~~\__/~~\_/~~\_______/~~\________/~~\__/~~\_______/~~\_______
     * /~~\__/~~\_/~~~~~~~~\_/~~~~~~~~\_/~~~~\_/~~~~~~~~\_/~~\_______
     * ______________________________________________________________
     * }</pre>
     */
    public static final String RELIEF = "relief";

    /**
     * {@code fonts/relief2.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
     * //////// \\///////// \/// \\\\\\\///// \///////// \///////// \\/////// \
     * /// \\/// \/// \\\\\\\/// \\\\\\\\/// \\/// \\\\\\\/// \\\\\\\/// \/// \
     * //////// \\/////// \\\/// \\\\\\\\/// \\/////// \\\/////// \\\\\\/// \\\
     * /// \\/// \/// \\\\\\\/// \\\\\\\\/// \\/// \\\\\\\/// \\\\\\\\/// \\\\\
     * /// \\/// \///////// \///////// \///// \///////// \/// \\\\\\\//////// \
     * \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
     * }</pre>
     */
    public static final String RELIEF2 = "relief2";

    /**
     * {@code fonts/rev.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ========================
     * =       ================
     * =  ====  ===============
     * =  ====  ===============
     * =  ===   ===   ===  =  =
     * =      ====  =  ==  =  =
     * =  ====  ==     ===   ==
     * =  ====  ==  ======   ==
     * =  ====  ==  =  ==== ===
     * =  ====  ===   ===== ===
     * ========================
     * }</pre>
     */
    public static final String REV = "rev";

    /**
     * {@code fonts/reverse.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ======================================================
     * =       ==============================================
     * =  ====  =============================================
     * =  ====  =============================================
     * =  ===   ===   ===  =  ===   ===  =   ====   ====   ==
     * =      ====  =  ==  =  ==  =  ==    =  ==  =  ==  =  =
     * =  ====  ==     ===   ===     ==  ========  ====     =
     * =  ====  ==  ======   ===  =====  =========  ===  ====
     * =  ====  ==  =  ==== ====  =  ==  =======  =  ==  =  =
     * =  ====  ===   ===== =====   ===  ========   ====   ==
     * ======================================================
     * }</pre>
     */
    public static final String REVERSE = "reverse";

    /**
     * {@code fonts/roman.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ooooooooo.
     * `888   `Y88.
     * 888   .d88'  .ooooo.  ooo. .oo.  .oo.    .oooo.   ooo. .oo.
     * 888ooo88P'  d88' `88b `888P"Y88bP"Y88b  `P  )88b  `888P"Y88b
     * 888`88b.    888   888  888   888   888   .oP"888   888   888
     * 888  `88b.  888   888  888   888   888  d8(  888   888   888
     * o888o  o888o `Y8bod8P' o888o o888o o888o `Y888""8o o888o o888o
     *
     *
     *
     * }</pre>
     */
    public static final String ROMAN = "roman";

    /**
     * {@code fonts/rot13.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * Ebg13
     * }</pre>
     */
    public static final String ROT13 = "rot13";

    /**
     * {@code fonts/rotated.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ____   _    _,_ _     _,_  _    _
     * _/(_) (_)  ( '  _|)  ( '  (|)  (_)_
     *
     * }</pre>
     */
    public static final String ROTATED = "rotated";

    /**
     * {@code fonts/rounded.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ______                            _             _
     * (_____ \                          | |           | |
     * _____) )  ___   _   _  ____    __| | _____   __| |
     * |  __  /  / _ \ | | | ||  _ \  / _  || ___ | / _  |
     * | |  \ \ | |_| || |_| || | | |( (_| || ____|( (_| |
     * |_|   |_| \___/ |____/ |_| |_| \____||_____) \____|
     *
     * }</pre>
     */
    public static final String ROUNDED = "rounded";

    /**
     * {@code fonts/rowancap.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * dMMMMb    .aMMMb    dMP dMP dMP     .aMMMb     dMMMMb    .aMMMb     .aMMMb     dMMMMb
     * dMP.dMP   dMP"dMP   dMP dMP dMP     dMP"dMP    dMP dMP   dMP"VMP    dMP"dMP    dMP.dMP
     * dMMMMK"   dMP dMP   dMP dMP dMP     dMMMMMP    dMP dMP   dMP        dMMMMMP    dMMMMP"
     * dMP"AMF   dMP.aMP   dMP.dMP.dMP     dMP dMP    dMP dMP   dMP.aMP    dMP dMP    dMP
     * dMP dMP    VMMMP"    VMMMPVMMP"     dMP dMP    dMP dMP    VMMMP"    dMP dMP    dMP
     *
     * }</pre>
     */
    public static final String ROWANCAP = "rowancap";

    /**
     * {@code fonts/rowan_cap.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * dMMMMb    .aMMMb    dMP dMP dMP     .aMMMb     dMMMMb    .aMMMb     .aMMMb     dMMMMb
     * dMP.dMP   dMP"dMP   dMP dMP dMP     dMP"dMP    dMP dMP   dMP"VMP    dMP"dMP    dMP.dMP
     * dMMMMK"   dMP dMP   dMP dMP dMP     dMMMMMP    dMP dMP   dMP        dMMMMMP    dMMMMP"
     * dMP"AMF   dMP.aMP   dMP.dMP.dMP     dMP dMP    dMP dMP   dMP.aMP    dMP dMP    dMP
     * dMP dMP    VMMMP"    VMMMPVMMP"     dMP dMP    dMP dMP    VMMMP"    dMP dMP    dMP
     *
     * }</pre>
     */
    public static final String ROWAN_CAP = "rowan_cap";

    /**
     * {@code fonts/rozzo.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * 888 88e
     * 888 888D  e88 88e  8P d8P 8P d8P  e88 88e
     * 888 88"  d888 888b P d8P  P d8P  d888 888b
     * 888 b,   Y888 888P  d8P d  d8P d Y888 888P
     * 888 88b,  "88 88"  d8P d8 d8P d8  "88 88"
     *
     *
     * }</pre>
     */
    public static final String ROZZO = "rozzo";

    /**
     * {@code fonts/runic.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * |~\
     * |  \
     * |  /
     * |_/
     * | \
     * |  \
     * }</pre>
     */
    public static final String RUNIC = "runic";

    /**
     * {@code fonts/runyc.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * |~\
     * |  \
     * |  /
     * |_/  |\   |  |~\ |
     * | \  | | `|  |_| |
     * |  \ | |  |` ||| |\
     * }</pre>
     */
    public static final String RUNYC = "runyc";

    /**
     * {@code fonts/santaclara.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * __,                         _
     * (               _/_         //
     * `.  __,  _ _   /  __,  _, // __,  _   __,
     * (___)(_/(_/ / /_(__(_/(_(__(/_(_/(_/ (_(_/(_
     *
     *
     * }</pre>
     */
    public static final String SANTACLARA = "santaclara";

    /**
     * {@code fonts/santa_clara.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * __,                      _
     * (               _/_      //
     * `.  __,  _ _   /  __ , // __,  _   __,
     * (___)(_/(_/ / /_(__(_   (/_(_/(_/ (_(_/(_
     * ___
     *
     * }</pre>
     */
    public static final String SANTA_CLARA = "santa_clara";

    /**
     * {@code fonts/sblood.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * @@@@@@ @@@@@@@  @@@       @@@@@@   @@@@@@  @@@@@@@
     * !@@     @@!  @@@ @@!      @@!  @@@ @@!  @@@ @@!  @@@
     * !@@!!  @!@!@!@  @!!      @!@  !@! @!@  !@! @!@  !@!
     * !:! !!:  !!! !!:      !!:  !!! !!:  !!! !!:  !!!
     * ::.: :  :: : ::  : ::.: :  : :. :   : :. :  :: :  :
     *
     * }</pre>
     */
    public static final String SBLOOD = "sblood";

    /**
     * {@code fonts/serifcap.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ___  ___  ___   __  ___   __   __   ___
     * / __)(  _)(  ,) (  )(  _) / _) (  ) (  ,\
     * \__ \ ) _) )  \  )(  ) _)( (_  /__\  ) _/
     * (___/(___)(_)\_)(__)(_)   \__)(_)(_)(_)
     * }</pre>
     */
    public static final String SERIFCAP = "serifcap";

    /**
     * {@code fonts/shimrod.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ,-.  .                     .
     * (   ` |   o                 |
     * `-.  |-. . ;-.-. ;-. ,-. ,-|
     * .   ) | | | | | | |   | | | |
     * `-'  ' ' ' ' ' ' '   `-' `-'
     *
     * }</pre>
     */
    public static final String SHIMROD = "shimrod";

    /**
     * {@code fonts/short.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * (`|_    |-
     * _)||()|`|_
     *
     * }</pre>
     */
    public static final String SHORT = "short";

    /**
     * {@code fonts/slant_relief.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * _____/\\\\\\\\\\\___        __/\\\\\\____        ________________        _______________        _______________        ___________________        _______________        ________________        __/\\\\\\____        _______        ________________        ________/\\\\\_
     * ___/\\\/////////\\\_        _\////\\\____        ________________        _______________        _______________        ___________________        _______________        ________________        _\////\\\____        _______        ________________        ______/\\\///__
     * __\//\\\______\///__        ____\/\\\____        ________________        _______________        _____/\\\______        ___________________        _______________        ________________        ____\/\\\____        __/\\\_        ________________        _____/\\\______
     * ___\////\\\_________        ____\/\\\____        __/\\\\\\\\\____        __/\\/\\\\\\___        __/\\\\\\\\\\\_        ___________________        __/\\/\\\\\\\__        _____/\\\\\\\\__        ____\/\\\____        _\///__        _____/\\\\\\\\__        __/\\\\\\\\\___
     * ______\////\\\______        ____\/\\\____        _\////////\\\___        _\/\\\////\\\__        _\////\\\////__        ___________________        _\/\\\/////\\\_        ___/\\\/////\\\_        ____\/\\\____        __/\\\_        ___/\\\/////\\\_        _\////\\\//____
     * _________\////\\\___        ____\/\\\____        ___/\\\\\\\\\\__        _\/\\\__\//\\\_        ____\/\\\______        ___________________        _\/\\\___\///__        __/\\\\\\\\\\\__        ____\/\\\____        _\/\\\_        __/\\\\\\\\\\\__        ____\/\\\______
     * __/\\\______\//\\\__        ____\/\\\____        __/\\\/////\\\__        _\/\\\___\/\\\_        ____\/\\\_/\\__        ___________________        _\/\\\_________        _\//\\///////___        ____\/\\\____        _\/\\\_        _\//\\///////___        ____\/\\\______
     * _\///\\\\\\\\\\\/___        __/\\\\\\\\\_        _\//\\\\\\\\/\\_        _\/\\\___\/\\\_        ____\//\\\\\___        __/\\\\\\\\\\\\\\\_        _\/\\\_________        __\//\\\\\\\\\\_        __/\\\\\\\\\_        _\/\\\_        __\//\\\\\\\\\\_        ____\/\\\______
     * ___\///////////_____        _\/////////__        __\////////\//__        _\///____\///__        _____\/////____        _\///////////////__        _\///__________        ___\//////////__        _\/////////__        _\///__        ___\//////////__        ____\///_______
     * }</pre>
     */
    public static final String SLANT_RELIEF = "slant_relief";

    /**
     * {@code fonts/slide.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * #HH||#| #|   H|
     * ##    #|      H| #H|
     * #HH| #| #| #HH|##HH|
     * ||#| #|## H|##
     * ##HH| #H|#H|#HH| #HH|
     *
     * }</pre>
     */
    public static final String SLIDE = "slide";

    /**
     * {@code fonts/slscript.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ()     _
     * /\    //                 _/_
     * /  )  // _   _. __  o _   /
     * /__/__</_/_)_(__/ (_<_/_)_<__
     * /
     * '
     * }</pre>
     */
    public static final String SLSCRIPT = "slscript";

    /**
     * {@code fonts/sl_script.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ()     _
     * /\    //                   _/_
     * /  )  //   _   _. __  o _   /
     * /__/__</_ _/_)_(__/ (_<_/_)_<__
     * /
     * '
     * }</pre>
     */
    public static final String SL_SCRIPT = "sl_script";

    /**
     * {@code fonts/smallcaps.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ___   _   _    _    _      _      ___    _    ____    ___
     * (  _( ) \_/ (  )_\  ) |    ) |    / _(   )_\  )  _)\  (  _(
     * _) \  |  _  | /( )\ | (__  | (__  ))_   /( )\ | '__/  _) \
     * )____) )_( )_()_/ \_()____( )____( \__( )_/ \_()_(    )____)
     *
     * }</pre>
     */
    public static final String SMALLCAPS = "smallcaps";

    /**
     * {@code fonts/small_caps.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ___   _   _    _    _      _             ___    _    ____    ___
     * (  _( ) \_/ (  )_\  ) |    ) |           / _(   )_\  )  _)\  (  _(
     * _) \  |  _  | /( )\ | (__  | (__         ))_   /( )\ | '__/  _) \
     * )____) )_( )_()_/ \_()____( )____(  _____ \__( )_/ \_()_(    )____)
     * )_____(
     * }</pre>
     */
    public static final String SMALL_CAPS = "small_caps";

    /**
     * {@code fonts/small_isometric1.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ___       ___       ___       ___       ___       ___       ___       ___       ___       ___       ___       ___       ___       ___
     * /\  \     /\__\     /\  \     /\__\     /\__\     /\  \     /\  \     /\  \     /\__\     /\  \     /\  \     /\  \     /\  \     /\  \
     * /::\  \   /::L_L_   /::\  \   /:/  /    /:/  /    _\:\  \   /::\  \   /::\  \   /::L_L_   /::\  \    \:\  \   /::\  \   _\:\  \   /::\  \
     * /\:\:\__\ /:/L:\__\ /::\:\__\ /:/__/    /:/__/    /\/::\__\ /\:\:\__\ /:/\:\__\ /:/L:\__\ /::\:\__\   /::\__\ /::\:\__\ /\/::\__\ /:/\:\__\
     * \:\:\/__/ \/_/:/  / \/\::/  / \:\  \    \:\  \    \::/\/__/ \:\:\/__/ \:\/:/  / \/_/:/  / \:\:\/  /  /:/\/__/ \;:::/  / \::/\/__/ \:\ \/__/
     * \::/  /    /:/  /    /:/  /   \:\__\    \:\__\    \:\__\    \::/  /   \::/  /    /:/  /   \:\/  /   \/__/     |:\/__/   \:\__\    \:\__\
     * \/__/     \/__/     \/__/     \/__/     \/__/     \/__/     \/__/     \/__/     \/__/     \/__/               \|__|     \/__/     \/__/
     * }</pre>
     */
    public static final String SMALL_ISOMETRIC1 = "small_isometric1";

    /**
     * {@code fonts/small_keyboard.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ____  ____  ____  ____  ____  ____  ____  ____  ____  ____  ____  ____  ____  ____
     * ||S ||||m ||||a ||||l ||||l ||||_ ||||k ||||e ||||y ||||b ||||o ||||a ||||r ||||d ||
     * ||__||||__||||__||||__||||__||||__||||__||||__||||__||||__||||__||||__||||__||||__||
     * |/__\||/__\||/__\||/__\||/__\||/__\||/__\||/__\||/__\||/__\||/__\||/__\||/__\||/__\|
     * }</pre>
     */
    public static final String SMALL_KEYBOARD = "small_keyboard";

    /**
     * {@code fonts/small_poison.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     *
     * @@@@@@ @@@@@@@@@@   @@@@@@  @@@      @@@               @@@@@@@   @@@@@@  @@@  @@@@@@  @@@@@@  @@@  @@@
     * !@@     @@! @@! @@! @@!  @@@ @@!      @@!               @@!  @@@ @@!  @@@ @@! !@@     @@!  @@@ @@!@!@@@
     * !@@!!  @!! !!@ @!@ @!@!@!@! @!!      @!!               @!@@!@!  @!@  !@! !!@  !@@!!  @!@  !@! @!@@!!@!
     * !:! !!:     !!: !!:  !!! !!:      !!:               !!:      !!:  !!! !!:     !:! !!:  !!! !!:  !!!
     * ::.: :   :      :    :   : : : ::.: : : ::.: : .......   :        : :. :  :   ::.: :   : :. :  ::    :
     * : :: : :
     * }</pre>
     */
    public static final String SMALL_POISON = "small_poison";

    /**
     * {@code fonts/small_script.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     *
     * ()          _,  |\ |\   ,   _   ,_  o    _|_
     * /\ /|/|/|  / |  |/ |/  / \_/   /  | | |/\_|
     * /(_) | | |_/\/|_/|_/|_/  \/ \__/   |/|/|_/ |_/
     * ____             (|
     * }</pre>
     */
    public static final String SMALL_SCRIPT = "small_script";

    /**
     * {@code fonts/small_shadow.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * __|             | |   |              |
     * \__ \  ` \   _` | |(_-<   \   _` |  _` |  _ \\ \  \ /
     * ____/_|_|_|\__,_|_|___/_| _|\__,_|\__,_|\___/ \_/\_/
     * ____|
     * }</pre>
     */
    public static final String SMALL_SHADOW = "small_shadow";

    /**
     * {@code fonts/small_slant.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ____           ____       __          __
     * / __/_ _  ___ _/ / /  ___ / /__ ____  / /_
     * _\ \/  ' \/ _ `/ / /  (_-</ / _ `/ _ \/ __/
     * /___/_/_/_/\_,_/_/_/__/___/_/\_,_/_//_/\__/
     * /___/
     * }</pre>
     */
    public static final String SMALL_SLANT = "small_slant";

    /**
     * {@code fonts/small_tengwar.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * _   _ _  .',                 ,'  _ _  _____     .',
     * ( ) |_)_)  |  --- ---     |~)  | | ) ) (_(_| |~)  |  \/
     * /            (_, (_, ___ |                | ~~~     (,
     * }</pre>
     */
    public static final String SMALL_TENGWAR = "small_tengwar";

    /**
     * {@code fonts/smisome1.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ___       ___       ___       ___       ___       ___       ___
     * /\  \     /\__\     /\  \     /\  \     /\  \     /\__\     /\  \
     * /::\  \   /::L_L_   _\:\  \   /::\  \   /::\  \   /::L_L_   /::\  \
     * /\:\:\__\ /:/L:\__\ /\/::\__\ /\:\:\__\ /:/\:\__\ /:/L:\__\ /::\:\__\
     * \:\:\/__/ \/_/:/  / \::/\/__/ \:\:\/__/ \:\/:/  / \/_/:/  / \:\:\/  /
     * \::/  /    /:/  /   \:\__\    \::/  /   \::/  /    /:/  /   \:\/  /
     * \/__/     \/__/     \/__/     \/__/     \/__/     \/__/     \/__/
     * }</pre>
     */
    public static final String SMISOME1 = "smisome1";

    /**
     * {@code fonts/smkeyboard.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ____  ____  ____  ____  ____  ____  ____  ____  ____  ____
     * ||S ||||m ||||k ||||e ||||y ||||b ||||o ||||a ||||r ||||d ||
     * ||__||||__||||__||||__||||__||||__||||__||||__||||__||||__||
     * |/__\||/__\||/__\||/__\||/__\||/__\||/__\||/__\||/__\||/__\|
     * }</pre>
     */
    public static final String SMKEYBOARD = "smkeyboard";

    /**
     * {@code fonts/smpoison.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     *
     * @@@@@@ @@@@@@@@@@  @@@@@@@   @@@@@@  @@@  @@@@@@  @@@@@@  @@@  @@@
     * !@@     @@! @@! @@! @@!  @@@ @@!  @@@ @@! !@@     @@!  @@@ @@!@!@@@
     * !@@!!  @!! !!@ @!@ @!@@!@!  @!@  !@! !!@  !@@!!  @!@  !@! @!@@!!@!
     * !:! !!:     !!: !!:      !!:  !!! !!:     !:! !!:  !!! !!:  !!!
     * ::.: :   :      :    :        : :. :  :   ::.: :   : :. :  ::    :
     *
     * }</pre>
     */
    public static final String SMPOISON = "smpoison";

    /**
     * {@code fonts/smtengwar.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * _   _ _      ,'  _ _  _____     .',
     * ( ) |_)_) |~)  | | ) ) (_(_| |~)  |  \/
     * /        |                | ~~~     (,
     * }</pre>
     */
    public static final String SMTENGWAR = "smtengwar";

    /**
     * {@code fonts/soft.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     *
     * ,---.          ,---.  ,--.
     * '   .-'  ,---. /  .-',-'  '-.
     * `.  `-. | .-. ||  `-,'-.  .-'
     * .-'    |' '-' '|  .-'  |  |
     * `-----'  `---' `--'    `--'
     *
     * }</pre>
     */
    public static final String SOFT = "soft";

    /**
     * {@code fonts/speed.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ________                     _________
     * __  ___/________ _____ _____ ______  /
     * _____ \ ___  __ \_  _ \_  _ \_  __  /
     * ____/ / __  /_/ //  __//  __// /_/ /
     * /____/  _  .___/ \___/ \___/ \__,_/
     * /_/
     * }</pre>
     */
    public static final String SPEED = "speed";

    /**
     * {@code fonts/spliff.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * _____  _____  ____   ___  _____  _____
     * /  ___>/  _  \/  _/  /___\/   __\/   __\
     * |___  ||   __/|  |---|   ||   __||   __|
     * <_____/\__/   \_____/\___/\__/   \__/
     *
     * }</pre>
     */
    public static final String SPLIFF = "spliff";

    /**
     * {@code fonts/stacey.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ___________________________________________
     * 7     77      77  _  77     77     77  7  7
     * |  ___!!__  __!|  _  ||  ___!|  ___!|  !  |
     * !__   7  7  7  |  7  ||  7___|  __|_!_   _!
     * 7     |  |  |  |  |  ||     7|     7 7   7
     * !_____!  !__!  !__!__!!_____!!_____! !___!
     *
     * }</pre>
     */
    public static final String STACEY = "stacey";

    /**
     * {@code fonts/stampate.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * .---. .                    .
     * \___  |- ,-. ,-,-. ,-. ,-. |- ,-.
     * \ |  ,-| | | | | | ,-| |  |-'
     * `---' `' `-^ ' ' ' |-' `-^ `' `-'
     * |
     * '
     * }</pre>
     */
    public static final String STAMPATE = "stampate";

    /**
     * {@code fonts/stampatello.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * .---. .                    .      .  .
     * \___  |- ,-. ,-,-. ,-. ,-. |- ,-. |  |  ,-.
     * \ |  ,-| | | | | | ,-| |  |-' |  |  | |
     * `---' `' `-^ ' ' ' |-' `-^ `' `-' `' `' `-'
     * |
     * '
     * }</pre>
     */
    public static final String STAMPATELLO = "stampatello";

    /**
     * {@code fonts/starstrips.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ------------------------  ------   ----------- ----------------------------------- ------------------- ------------
     * *********************** ********  *********** *********************************** ********************************
     * ----        ---------------------- ----    --- ----        ----------------    ---   ----  ---      -------
     * ***********    ****   ****    *************   ************    ****    *********     ****  ************************
     * ------------    ----   ---------------------   ------------    ----    ---------     ----  ----------- ------------
     * ****    ****   ****************  ****         *****    ****    ****  ****    ****  ****               *****
     * ------------    ----   ----    --------   ---- ------------    ----    ----   ---- ------------        ------------
     * ***********    ****   ****    ********    ****************    ****    ****    ****************        ************
     *
     * }</pre>
     */
    public static final String STARSTRIPS = "starstrips";

    /**
     * {@code fonts/starwars.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * _______..___________.     ___      .______      ____    __    ____      ___      .______           _______.
     * /       ||           |    /   \     |   _  \     \   \  /  \  /   /     /   \     |   _  \         /       |
     * |   (----``---|  |----`   /  ^  \    |  |_)  |     \   \/    \/   /     /  ^  \    |  |_)  |       |   (----`
     * \   \        |  |       /  /_\  \   |      /       \            /     /  /_\  \   |      /         \   \
     * .----)   |       |  |      /  _____  \  |  |\  \----.   \    /\    /     /  _____  \  |  |\  \----..----)   |
     * |_______/        |__|     /__/     \__\ | _| `._____|    \__/  \__/     /__/     \__\ | _| `._____||_______/
     *
     * }</pre>
     */
    public static final String STARWARS = "starwars";

    /**
     * {@code fonts/star_strips.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ------------ ------------    ------    -----------  _ ------------ ------------ -----------  --------  -----------  ------------
     * *********** ************   ********   ***********    ************ ************ ***********  ********  ************ ************
     * ----         ------------  ----------  ----    ---    ----         ------------ ----    ---    ----    ---      --- ----
     * ***********     ****     ****    **** *********      ************     ****     *********      ****    ************ ************
     * ------------     ----     ------------ ---------      ------------     ----     ---------      ----    -----------  ------------
     * ****     ****     ************ ****  ****            *****     ****     ****  ****     ****    ****                *****
     * ------------     ----     ----    ---- ----   ----    ------------     ----     ----   ----  --------  ----         ------------
     * ***********     ****     ****    **** ****    ****   ************     ****     ****    **** ********  ****         ************
     *
     * }</pre>
     */
    public static final String STAR_STRIPS = "star_strips";

    /**
     * {@code fonts/star_wars.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * _______..___________.     ___      .______              ____    __    ____      ___      .______           _______.
     * /       ||           |    /   \     |   _  \             \   \  /  \  /   /     /   \     |   _  \         /       |
     * |   (----``---|  |----`   /  ^  \    |  |_)  |             \   \/    \/   /     /  ^  \    |  |_)  |       |   (----`
     * \   \        |  |       /  /_\  \   |      /               \            /     /  /_\  \   |      /         \   \
     * .----)   |       |  |      /  _____  \  |  |\  \----.           \    /\    /     /  _____  \  |  |\  \----..----)   |
     * |_______/        |__|     /__/     \__\ | _| `._____| ______     \__/  \__/     /__/     \__\ | _| `._____||_______/
     * |______|
     * }</pre>
     */
    public static final String STAR_WARS = "star_wars";

    /**
     * {@code fonts/stellar.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * `.. ..    `..             `.. `..
     * `..    `..  `..             `.. `..
     * `..      `.`. `.   `..     `.. `..   `..    `. `...
     * `..      `..   `.   `..  `.. `.. `..  `..  `..
     * `..   `..  `..... `.. `.. `..`..   `..  `..
     * `..    `..  `..  `.         `.. `..`..   `..  `..
     * `.. ..     `..   `....   `...`...  `.. `...`...
     *
     * }</pre>
     */
    public static final String STELLAR = "stellar";

    /**
     * {@code fonts/stick_letters.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * __  ___    __                 ___ ___ ___  ___  __   __
     * /__`  |  | /  ` |__/     |    |__   |   |  |__  |__) /__`
     * .__/  |  | \__, |  \ ___ |___ |___  |   |  |___ |  \ .__/
     *
     * }</pre>
     */
    public static final String STICK_LETTERS = "stick_letters";

    /**
     * {@code fonts/stop.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * _
     * | |    _
     * \ \  | |_    ___   ____
     * \ \ |  _)  / _ \ |  _ \
     * _____) )| |__ | |_| || | | |
     * (______/  \___) \___/ | ||_/
     * |_|
     * }</pre>
     */
    public static final String STOP = "stop";

    /**
     * {@code fonts/straight.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * __
     * (_ |_ _ _ . _ |_ |_
     * __)|_| (_||(_)| )|_
     * _/
     * }</pre>
     */
    public static final String STRAIGHT = "straight";

    /**
     * {@code fonts/stronger_than_all.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * .________|_____._\.______  ._______  :.______  :._____  ._______:.______  _____._\.___.__  .______  .______  :.______  .___   �.___   �
     *    ___/__ _:| : __   \� .___  \ |      \�:_ ___\  .____/| : __   \�__ _:| :   |  \:            \�:      �|   |  |   | �
     * |___     |  :| |  \____ :   |  ||�|      |   |___: _/\ | �|  \____ |  :|� |   : �\ |   . �|      \ |   . � |   |� |   |
     * \|       |   |||   :       :  | ||   |  |   /    /  \|||   :  � |   |� ||   .   ||   : ||   |    ||   :   |     |  
     * � /|__:___  |   \ |   |_ \_. ___/  ||___|   ||. __  _.: __/ \ |   |_  |     ||___|    ||___| ||___|      ||___| |/\ | � |/\ | �
     * /    : |  |_____\|___| �   :/   �|    |___| :/ |.   :/  �__\|___| �|  |___  |       |   |    |___   |   � /  \|_� /  \|_
     *        |             �    :  |      �| :   :�     �        |    �|___|      |___|    |      � |___|    _____/  _____/ 
     * �                          �         /     �                 �                          �                        �     �
     * �:                                                                           �        �
     * }</pre>
     */
    public static final String STRONGER_THAN_ALL = "stronger_than_all";

    /**
     * {@code fonts/sub_zero.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ______     __  __     ______     ______     ______     ______     ______
     * /\  ___\   /\ \/\ \   /\  == \   /\___  \   /\  ___\   /\  == \   /\  __ \
     * \ \___  \  \ \ \_\ \  \ \  __<   \/_/  /__  \ \  __\   \ \  __<   \ \ \/\ \
     * \/\_____\  \ \_____\  \ \_____\   /\_____\  \ \_____\  \ \_\ \_\  \ \_____\
     * \/_____/   \/_____/   \/_____/   \/_____/   \/_____/   \/_/ /_/   \/_____/
     *
     * }</pre>
     */
    public static final String SUB_ZERO = "sub_zero";

    /**
     * {@code fonts/swampland.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ______   __ __ __   ________   ___ __ __   ______   __       ________   ___   __    ______
     * /_____/\ /_//_//_/\ /_______/\ /__//_//_/\ /_____/\ /_/\     /_______/\ /__/\ /__/\ /_____/\
     * \::::_\/_\:\\:\\:\ \\::: _  \ \\::\| \| \ \\:::_ \ \\:\ \    \::: _  \ \\::\_\\  \ \\:::_ \ \
     * \:\/___/\\:\\:\\:\ \\::(_)  \ \\:.      \ \\:(_) \ \\:\ \    \::(_)  \ \\:. `-\  \ \\:\ \ \ \
     * \_::._\:\\:\\:\\:\ \\:: __  \ \\:.\-/\  \ \\: ___\/ \:\ \____\:: __  \ \\:. _    \ \\:\ \ \ \
     * /____\:\\:\\:\\:\ \\:.\ \  \ \\. \  \  \ \\ \ \    \:\/___/\\:.\ \  \ \\. \`-\  \ \\:\/.:| |
     * \_____\/ \_______\/ \__\/\__\/ \__\/ \__\/ \_\/     \_____\/ \__\/\__\/ \__\/ \__\/ \____/_/
     *
     * }</pre>
     */
    public static final String SWAMPLAND = "swampland";

    /**
     * {@code fonts/swamp_land.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ______   __ __ __   ________   ___ __ __   ______         __       ________   ___   __    ______
     * /_____/\ /_//_//_/\ /_______/\ /__//_//_/\ /_____/\       /_/\     /_______/\ /__/\ /__/\ /_____/\
     * \::::_\/_\:\\:\\:\ \\::: _  \ \\::\| \| \ \\:::_ \ \      \:\ \    \::: _  \ \\::\_\\  \ \\:::_ \ \
     * \:\/___/\\:\\:\\:\ \\::(_)  \ \\:.      \ \\:(_) \ \      \:\ \    \::(_)  \ \\:. `-\  \ \\:\ \ \ \
     * \_::._\:\\:\\:\\:\ \\:: __  \ \\:.\-/\  \ \\: ___\/_______\:\ \____\:: __  \ \\:. _    \ \\:\ \ \ \
     * /____\:\\:\\:\\:\ \\:.\ \  \ \\. \  \  \ \\ \ \ /______/\\:\/___/\\:.\ \  \ \\. \`-\  \ \\:\/.:| |
     * \_____\/ \_______\/ \__\/\__\/ \__\/ \__\/ \_\/ \__::::\/ \_____\/ \__\/\__\/ \__\/ \__\/ \____/_/
     *
     * }</pre>
     */
    public static final String SWAMP_LAND = "swamp_land";

    /**
     * {@code fonts/swan.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     *
     *
     * .-.
     * (   )
     * `-..  .    ._.-.  .--.
     * (   )\  \  / (   ) |  |
     * `-'  `' `'   `-'`-'  `-
     *
     *
     * }</pre>
     */
    public static final String SWAN = "swan";

    /**
     * {@code fonts/sweet.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ___
     * (   )
     * .--.     ___  ___  ___   .--.     .--.    | |_
     * /  _  \   (   )(   )(   ) /    \   /    \  (   __)
     * . .' `. ;   | |  | |  | | |  .-. ; |  .-. ;  | |
     * | '   | |   | |  | |  | | |  | | | |  | | |  | | ___
     * _\_`.(___)  | |  | |  | | |  |/  | |  |/  |  | |(   )
     * (   ). '.    | |  | |  | | |  ' _.' |  ' _.'  | | | |
     * | |  `\ |   | |  ; '  | | |  .'.-. |  .'.-.  | ' | |
     * ; '._,' '   ' `-'   `-' ' '  `-' / '  `-' /  ' `-' ;
     * '.___.'     '.__.'.__.'   `.__.'   `.__.'    `.__.
     *
     *
     * }</pre>
     */
    public static final String SWEET = "sweet";

    /**
     * {@code fonts/s_blood.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * @@@@@@          @@@@@@@  @@@       @@@@@@   @@@@@@  @@@@@@@
     * !@@              @@!  @@@ @@!      @@!  @@@ @@!  @@@ @@!  @@@
     * !@@!!           @!@!@!@  @!!      @!@  !@! @!@  !@! @!@  !@!
     * !:!          !!:  !!! !!:      !!:  !!! !!:  !!! !!:  !!!
     * ::.: :  .......  :: : ::  : ::.: :  : :. :   : :. :  :: :  :
     * : :: : :
     * }</pre>
     */
    public static final String S_BLOOD = "s_blood";

    /**
     * {@code fonts/s_relief.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * _____/\\\\\\\\\\\___        ___________________        _______________        ________________        __/\\\\\\____        _______        ________________        ________/\\\\\_
     * ___/\\\/////////\\\_        ___________________        _______________        ________________        _\////\\\____        _______        ________________        ______/\\\///__
     * __\//\\\______\///__        ___________________        _______________        ________________        ____\/\\\____        __/\\\_        ________________        _____/\\\______
     * ___\////\\\_________        ___________________        __/\\/\\\\\\\__        _____/\\\\\\\\__        ____\/\\\____        _\///__        _____/\\\\\\\\__        __/\\\\\\\\\___
     * ______\////\\\______        ___________________        _\/\\\/////\\\_        ___/\\\/////\\\_        ____\/\\\____        __/\\\_        ___/\\\/////\\\_        _\////\\\//____
     * _________\////\\\___        ___________________        _\/\\\___\///__        __/\\\\\\\\\\\__        ____\/\\\____        _\/\\\_        __/\\\\\\\\\\\__        ____\/\\\______
     * __/\\\______\//\\\__        ___________________        _\/\\\_________        _\//\\///////___        ____\/\\\____        _\/\\\_        _\//\\///////___        ____\/\\\______
     * _\///\\\\\\\\\\\/___        __/\\\\\\\\\\\\\\\_        _\/\\\_________        __\//\\\\\\\\\\_        __/\\\\\\\\\_        _\/\\\_        __\//\\\\\\\\\\_        ____\/\\\______
     * ___\///////////_____        _\///////////////__        _\///__________        ___\//////////__        _\/////////__        _\///__        ___\//////////__        ____\///_______
     * }</pre>
     */
    public static final String S_RELIEF = "s_relief";

    /**
     * {@code fonts/tanja.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * T)tttttt                      ##
     * T)
     * T)    a)AAAA  n)NNNN       j) a)AAAA
     * T)     a)AAA  n)   NN      j)  a)AAA
     * T)    a)   A  n)   NN      j) a)   A
     * T)     a)AAAA n)   NN      j)  a)AAAA
     * j)   JJ
     * j)JJJ
     * }</pre>
     */
    public static final String TANJA = "tanja";

    /**
     * {@code fonts/tengwar.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * .dP'                                               db
     * dP'                                               db    db
     * "Ybaaaaaaaaad8'
     * `Yb.d888b   'Yb   `Yb d88b d88b   .dP'  dP'  88  `Yb d888b     'Yb    `Yb    dP'
     * 88'    8Y   88    88P   8Y   8b  88   88    88   88P    88     88      Yb  dP
     * 88     8P   88    88    8P   88  Y8   Y8   .88   88     8P     88       YbdP
     * 88   ,dP   .8P   .8P  bdP  bdP   `Y88P`Y88P'88   88   .dP     .8P       .8P
     * 88                                          88  .88888888b.           dP'  b
     * 88                                          88                        Y.  ,P
     * .8P                                          Y8.                        `""'
     * }</pre>
     */
    public static final String TENGWAR = "tengwar";

    /**
     * {@code fonts/test1.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * _________  __________ __________ _________
     * /__     __\/   /_____//_________//__     __\
     * `%%|___|%%'\___\%%%%%'`%%%%%%%%%/`%%|___|%%'
     * `B'     `BBBBBBBB'`BBBBBBBB'     `B'
     * }</pre>
     */
    public static final String TEST1 = "test1";

    /**
     * {@code fonts/the_edge.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ▄▄▄ ▄  █▄███�▄███�██▄  ▄▀ ▄███�
     * ▄▀ ▀� █   ▄   █▀   �   █▀   �   █  � ▄▀  �   █▀   �
     * �▀ █    � ██▀  ██▄▀  ██▄█  █    █ ▀��  ██▄�
     * █     ��▀█ ��    █▄  ��    █▄   █ █ ▄  █ ��    █▄
     * █       █   █ ▄▀ ▀█ ▄▀ ▀█ █  █  █  � ▄▀ ▀█
     * ▀             █  ██▀     ██▀     ██▀�██  ██▀
     * ▀
     * }</pre>
     */
    public static final String THE_EDGE = "the_edge";

    /**
     * {@code fonts/thick.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * 88888 8     w      8
     * 8   8d8b. w .d8b 8.dP
     * 8   8P Y8 8 8    88b
     * 8   8   8 8 `Y8P 8 Yb
     *
     * }</pre>
     */
    public static final String THICK = "thick";

    /**
     * {@code fonts/thin.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     *
     * --.--|    o
     * |  |---..,---.
     * |  |   |||   |
     * `  `   '``   '
     *
     * }</pre>
     */
    public static final String THIN = "thin";

    /**
     * {@code fonts/this.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ▄▀▀▀� ▄▀▀▄ ▄ ▄▀▀█▀▄▀▀▀
     * �▀▀▄ █ ▄  █  █   �▄   █   █▀▄ █ �
     * █  ▐ ▐��▀ ▐  █▄ █  ▐   █�   ▐    �
     * █        �▄▄█     █ ▐      █  �▄   ▀▄
     * ��       ▄▀   █    ▄▀    ▄▀▀▀�  █   █�
     * █      ▄▀   █   ▀▀▄  █  ��▀▀    �
     * ▐        ��     ▐   ▐     █ ▐    ��
     * }</pre>
     */
    public static final String THIS = "this";

    /**
     * {@code fonts/thorned.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ___, ,  _, ,_  ,  ,  _,  ,_
     * ' | |_|,/ \,|_) |\ | /_,  | \,
     * |'| |'\_/'| \ |'\|'\_  _|_/
     * ' ' ` '   '  `'  `   `'
     *
     * }</pre>
     */
    public static final String THORNED = "thorned";

    /**
     * {@code fonts/threepoint.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ~|~|_  _ _  _  _  _ . _ _|_
     * | | || (/_(/_|_)(_)|| | |
     * |
     * }</pre>
     */
    public static final String THREEPOINT = "threepoint";

    /**
     * {@code fonts/three_point.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ~|~|_  _ _  _    _  _ . _ _|_
     * | | || (/_(/___|_)(_)|| | |
     * |
     * }</pre>
     */
    public static final String THREE_POINT = "three_point";

    /**
     * {@code fonts/ticks.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * _/\/\/\/\/\/\__/\/\________________/\/\___________________
     * _____/\/\________________/\/\/\/\__/\/\__/\/\____/\/\/\/\_
     * _____/\/\______/\/\____/\/\________/\/\/\/\____/\/\/\/\___
     * _____/\/\______/\/\____/\/\________/\/\/\/\__________/\/\_
     * _____/\/\______/\/\/\____/\/\/\/\__/\/\__/\/\__/\/\/\/\___
     * __________________________________________________________
     * }</pre>
     */
    public static final String TICKS = "ticks";

    /**
     * {@code fonts/ticksslant.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * _/\/\/\/\/\/\__/\/\________________/\/\________________________________/\/\______________________________/\/\_____
     * _____/\/\________________/\/\/\/\__/\/\__/\/\____/\/\/\/\____/\/\/\/\__/\/\____/\/\/\______/\/\/\/\____/\/\/\/\/\_
     * _____/\/\______/\/\____/\/\________/\/\/\/\____/\/\/\/\____/\/\/\/\____/\/\________/\/\____/\/\__/\/\____/\/\_____
     * _____/\/\______/\/\____/\/\________/\/\/\/\__________/\/\________/\/\__/\/\____/\/\/\/\____/\/\__/\/\____/\/\_____
     * _____/\/\______/\/\/\____/\/\/\/\__/\/\__/\/\__/\/\/\/\____/\/\/\/\____/\/\/\__/\/\/\/\/\__/\/\__/\/\____/\/\/\___
     * __________________________________________________________________________________________________________________
     * }</pre>
     */
    public static final String TICKSSLANT = "ticksslant";

    /**
     * {@code fonts/ticks_slant.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * _/\/\/\/\/\/\__/\/\________________/\/\______________________________________________/\/\______________________________/\/\_____
     * _____/\/\________________/\/\/\/\__/\/\__/\/\____/\/\/\/\__________________/\/\/\/\__/\/\____/\/\/\______/\/\/\/\____/\/\/\/\/\_
     * _____/\/\______/\/\____/\/\________/\/\/\/\____/\/\/\/\__________________/\/\/\/\____/\/\________/\/\____/\/\__/\/\____/\/\_____
     * _____/\/\______/\/\____/\/\________/\/\/\/\__________/\/\______________________/\/\__/\/\____/\/\/\/\____/\/\__/\/\____/\/\_____
     * _____/\/\______/\/\/\____/\/\/\/\__/\/\__/\/\__/\/\/\/\__________________/\/\/\/\____/\/\/\__/\/\/\/\/\__/\/\__/\/\____/\/\/\___
     * ___________________________________________________________/\/\/\/\/\/\_________________________________________________________
     * }</pre>
     */
    public static final String TICKS_SLANT = "ticks_slant";

    /**
     * {@code fonts/tiles.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * [... [......    [..
     * [..     [. [..
     * [..        [..   [..     [....
     * [..    [.. [.. [.   [.. [..
     * [..    [.. [..[..... [..  [...
     * [..    [.. [..[.            [..
     * [..    [..[...  [....   [.. [..
     *
     * }</pre>
     */
    public static final String TILES = "tiles";

    /**
     * {@code fonts/tinker_toy.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * o-O-o        o                  o
     * |   o      | /                |
     * |     o-o  OO   o-o o-o      -o- o-o o  o
     * |   | |  | | \  |-' |         |  | | |  |
     * o   | o  o o  o o-o o         o  o-o o--O
     * o---o           |
     * o--o
     * }</pre>
     */
    public static final String TINKER_TOY = "tinker_toy";

    /**
     * {@code fonts/tombstone.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ___  _, _, _ __,  _, ___  _, _, _ __,
     * |  / \ |\/| |_) (_   |  / \ |\ | |_
     * |  \ / |  | |_) , )  |  \ / | \| |
     * ~   ~  ~  ~ ~    ~   ~   ~  ~  ~ ~~~
     *
     * }</pre>
     */
    public static final String TOMBSTONE = "tombstone";

    /**
     * {@code fonts/train.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * _____                     _
     * |_   _|    _ _   __ _     (_)    _ _
     * | |     | '_| / _` |    | |   | ' \
     * _|_|_   _|_|_  \__,_|   _|_|_  |_||_|
     * _|"""""|_|"""""|_|"""""|_|"""""|_|"""""|
     * "`-0-0-'"`-0-0-'"`-0-0-'"`-0-0-'"`-0-0-'
     * }</pre>
     */
    public static final String TRAIN = "train";

    /**
     * {@code fonts/trek.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * dBBBBBBP dBBBBBb    dBBBP  dBP dBP
     * dBP          d8P.dBP
     * dBP     dBBBBK   dBBP   dBBBBP
     * dBP     dBP  BB  dBP    dBP BB
     * dBP     dBP  dB' dBBBBP dBP dBP
     *
     * }</pre>
     */
    public static final String TREK = "trek";

    /**
     * {@code fonts/tsalagi.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * __    __    __    ___     __     ___   ___
     * \  /    /  \  |  \    |     |  \     |_-_  |
     * \/   __\___  |   \   |     |   \ `\/\    .|()
     * _ /        \   |   /   |  .  |   /  |  |  ()|'
     * \/      \__/   |__/    `__'  |__/    \/    _|_
     * }</pre>
     */
    public static final String TSALAGI = "tsalagi";

    /**
     * {@code fonts/tubular.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * O~~~ O~~~~~~        O~~               O~~
     * O~~            O~~               O~~
     * O~~    O~~  O~~O~~      O~~  O~~ O~~   O~~    O~ O~~~
     * O~~    O~~  O~~O~~ O~~  O~~  O~~ O~~ O~~  O~~  O~~
     * O~~    O~~  O~~O~~   O~~O~~  O~~ O~~O~~   O~~  O~~
     * O~~    O~~  O~~O~~   O~~O~~  O~~ O~~O~~   O~~  O~~
     * O~~      O~~O~~O~~ O~~    O~~O~~O~~~  O~~ O~~~O~~~
     *
     * }</pre>
     */
    public static final String TUBULAR = "tubular";

    /**
     * {@code fonts/twisted.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * _______   _      _   __  ______   _______     _____  _____
     * /\_______)\/_/\  /\_\ /\_\/ ____/\/\_______)\ /\_____\/\ __/\
     * \(___  __\/) ) )( ( ( \/_/) ) __\/\(___  __\/( (_____/) )  \ \
     * / / /   /_/ //\\ \_\ /\_\\ \ \    / / /     \ \__\ / / /\ \ \
     * ( ( (    \ \ /  \ / // / /_\ \ \  ( ( (      / /__/_\ \ \/ / /
     * \ \ \    )_) /\ (_(( (_()____) )  \ \ \    ( (_____\) )__/ /
     * /_/_/    \_\/  \/_/ \/_/\____\/   /_/_/     \/_____/\/___\/
     *
     * }</pre>
     */
    public static final String TWISTED = "twisted";

    /**
     * {@code fonts/twopoint.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ~|~     _ |) _ o._ _|_
     * | \/\/(_)| (_)|| | |
     * }</pre>
     */
    public static final String TWOPOINT = "twopoint";

    /**
     * {@code fonts/two_point.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ~|~     _   |) _ o._ _|_
     * | \/\/(_)__| (_)|| | |
     * }</pre>
     */
    public static final String TWO_POINT = "two_point";

    /**
     * {@code fonts/univers.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     *
     * 88        88               88
     * 88        88               ""
     * 88        88
     * 88        88  8b,dPPYba,   88  8b       d8   ,adPPYba,  8b,dPPYba,  ,adPPYba,
     * 88        88  88P'   `"8a  88  `8b     d8'  a8P_____88  88P'   "Y8  I8[    ""
     * 88        88  88       88  88   `8b   d8'   8PP"""""""  88           `"Y8ba,
     * Y8a.    .a8P  88       88  88    `8b,d8'    "8b,   ,aa  88          aa    ]8I
     * `"Y8888Y"'   88       88  88      "8"       `"Ybbd8"'  88          `"YbbdP"'
     *
     *
     * }</pre>
     */
    public static final String UNIVERS = "univers";

    /**
     * {@code fonts/usaflag.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * :::  === :::===  :::====  :::===== :::      :::====  :::=====
     * :::  === :::     :::  === :::      :::      :::  === :::
     * ===  ===  =====  ======== ======   ===      ======== === =====
     * ===  ===     === ===  === ===      ===      ===  === ===   ===
     * ======  ======  ===  === ===      ======== ===  ===  =======
     *
     * }</pre>
     */
    public static final String USAFLAG = "usaflag";

    /**
     * {@code fonts/usa_flag.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * :::  === :::===  :::====           :::===== :::      :::====  :::=====
     * :::  === :::     :::  ===          :::      :::      :::  === :::
     * ===  ===  =====  ========          ======   ===      ======== === =====
     * ===  ===     === ===  ===          ===      ===      ===  === ===   ===
     * ======  ======  ===  ===          ===      ======== ===  ===  =======
     * ========
     * }</pre>
     */
    public static final String USA_FLAG = "usa_flag";

    /**
     * {@code fonts/varsity.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * ____   ____                      _   _
     * |_  _| |_  _|                    (_) / |_
     * \ \   / /,--.   _ .--.  .--.   __ `| |-' _   __
     * \ \ / /`'_\ : [ `/'`\]( (`\] [  | | |  [ \ [  ]
     * \ ' / // | |, | |     `'.'.  | | | |,  \ '/ /
     * \_/  \'-;__/[___]   [\__) )[___]\__/[\_:  /
     * \__.'
     * }</pre>
     */
    public static final String VARSITY = "varsity";

    /**
     * {@code fonts/wavy.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     *
     * \  X  / _
     * \/ \/ (_( \) (_(
     * _)
     * }</pre>
     */
    public static final String WAVY = "wavy";

    /**
     * {@code fonts/weird.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     *
     * /  |      /         |
     * (   | ___    ___  ___|
     * | / )|___)| |   )|   )
     * |/|/ |__  | |    |__/
     *
     * }</pre>
     */
    public static final String WEIRD = "weird";

    /**
     * {@code fonts/wetletter.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * .-.  .-.,---. _______ ,-.    ,---. _______  _______ ,---.  ,---.
     * | |/\| || .-'|__   __|| |    | .-'|__   __||__   __|| .-'  | .-.\
     * | /  \ || `-.  )| |   | |    | `-.  )| |     )| |   | `-.  | `-'/
     * |  /\  || .-' (_) |   | |    | .-' (_) |    (_) |   | .-'  |   (
     * |(/  \ ||  `--. | |   | `--. |  `--. | |      | |   |  `--.| |\ \
     * (_)   \|/( __.' `-'   |( __.'/( __.' `-'      `-'   /( __.'|_| \)\
     * (__)           (_)   (__)                   (__)        (__)
     * }</pre>
     */
    public static final String WETLETTER = "wetletter";

    /**
     * {@code fonts/wet_letter.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * .-.  .-.,---. _______ _,-.    ,---. _______  _______ ,---.  ,---.
     * | |/\| || .-'|__   __| | |    | .-'|__   __||__   __|| .-'  | .-.\
     * | /  \ || `-.  )| |    | |    | `-.  )| |     )| |   | `-.  | `-'/
     * |  /\  || .-' (_) |    | |    | .-' (_) |    (_) |   | .-'  |   (
     * |(/  \ ||  `--. | |    | `--. |  `--. | |      | |   |  `--.| |\ \
     * (_)   \|/( __.' `-'    |( __.'/( __.' `-'      `-'   /( __.'|_| \)\
     * (__)            (_)   (__)                   (__)        (__)
     * }</pre>
     */
    public static final String WET_LETTER = "wet_letter";

    /**
     * {@code fonts/whimsy.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * d8b        d8,
     * ?88       `8P
     * 88b
     * ?88   d8P  d8P  888888b   88b  88bd8b,d88b  .d888b,?88   d8P
     * d88  d8P' d8P'  88P `?8b  88P  88P'`?8P'?8b ?8b,   d88   88
     * ?8b ,88b ,88'  d88   88P d88  d88  d88  88P   `?8b ?8(  d88
     * `?888P'888P'  d88'   88bd88' d88' d88'  88b`?888P' `?88P'?8b
     * )88
     * ,d8P
     * `?888P'
     * }</pre>
     */
    public static final String WHIMSY = "whimsy";

    /**
     * {@code fonts/wow.flf}
     *
     * <p>Example:
     *
     * <pre>{@code
     * \\/\\/ [[]] \\/\\/
     * }</pre>
     */
    public static final String WOW = "wow";

    private static Set<String> NAMES;

    public static Set<String> all() {
        if (NAMES == null) {
            NAMES = Set.of(
                    ONE_ROW,
                    THREED,
                    THREED_ASCII,
                    THREED_DIAGONAL,
                    THREE_X_FIVE,
                    THREE_D,
                    FOUR_MAX,
                    FIVE_LINEOBLIQUE,
                    FIVE_LINE_OBLIQUE,
                    ACROBATIC,
                    ALLIGATOR,
                    ALLIGATOR2,
                    ALLIGATOR3,
                    ALPHA,
                    ALPHABET,
                    AMC3LINE,
                    AMC3LIV1,
                    AMCAAA01,
                    AMCNEKO,
                    AMCRAZO2,
                    AMCRAZOR,
                    AMCSLASH,
                    AMCSLDER,
                    AMCTHIN,
                    AMCTUBES,
                    AMCUN1,
                    AMC_3_LINE,
                    AMC_3_LIV1,
                    AMC_AAA01,
                    AMC_NEKO,
                    AMC_RAZOR,
                    AMC_RAZOR2,
                    AMC_SLASH,
                    AMC_SLIDER,
                    AMC_THIN,
                    AMC_TUBES,
                    AMC_UNTITLED,
                    ANSI_REGULAR,
                    ANSI_SHADOW,
                    ARROWS,
                    ASCII_NEW_ROMAN,
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
                    BIGCHIEF,
                    BIGFIG,
                    BIG_CHIEF,
                    BIG_MONEY_NE,
                    BIG_MONEY_NW,
                    BIG_MONEY_SE,
                    BIG_MONEY_SW,
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
                    CALVIN_S,
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
                    COSMIKE,
                    CRAWFORD,
                    CRAWFORD2,
                    CRAZY,
                    CRICKET,
                    CURSIVE,
                    CYBERLARGE,
                    CYBERMEDIUM,
                    CYBERSMALL,
                    CYGNET,
                    DANC4,
                    DANCINGFONT,
                    DANCING_FONT,
                    DECIMAL,
                    DEFLEPPARD,
                    DEF_LEPPARD,
                    DELTA_CORPS_PRIEST_1,
                    DIAMOND,
                    DIETCOLA,
                    DIET_COLA,
                    DOH,
                    DOOM,
                    DOSREBEL,
                    DOS_REBEL,
                    DOTMATRIX,
                    DOT_MATRIX,
                    DOUBLE,
                    DOUBLESHORTS,
                    DOUBLE_SHORTS,
                    DRPEPPER,
                    DR_PEPPER,
                    DWHISTLED,
                    EFTICHESS,
                    EFTIFONT,
                    EFTIPITI,
                    EFTIROBOT,
                    EFTITALIC,
                    EFTIWALL,
                    EFTIWATER,
                    EFTI_CHESS,
                    EFTI_FONT,
                    EFTI_ITALIC,
                    EFTI_PITI,
                    EFTI_ROBOT,
                    EFTI_WALL,
                    EFTI_WATER,
                    ELECTRONIC,
                    ELITE,
                    EPIC,
                    FENDER,
                    FILTER,
                    FIRE_FONT_K,
                    FIRE_FONT_S,
                    FLIPPED,
                    FLOWERPOWER,
                    FLOWER_POWER,
                    FOURTOPS,
                    FOUR_TOPS,
                    FRAKTUR,
                    FUNFACE,
                    FUNFACES,
                    FUN_FACE,
                    FUN_FACES,
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
                    HEART_LEFT,
                    HEART_RIGHT,
                    HENRY3D,
                    HENRY_3D,
                    HEX,
                    HIEROGLYPHS,
                    HOLLYWOOD,
                    HORIZONTALLEFT,
                    HORIZONTALRIGHT,
                    HORIZONTAL_LEFT,
                    HORIZONTAL_RIGHT,
                    ICL_1900,
                    IMPOSSIBLE,
                    INVITA,
                    ISOMETRIC1,
                    ISOMETRIC2,
                    ISOMETRIC3,
                    ISOMETRIC4,
                    ITALIC,
                    JAZMINE,
                    JERUSALEM,
                    JS_BLOCK_LETTERS,
                    JS_BRACKET_LETTERS,
                    JS_CAPITAL_CURVES,
                    JS_CURSIVE,
                    JS_STICK_LETTERS,
                    KATAKANA,
                    KBAN,
                    KEYBOARD,
                    KNOB,
                    KONTO,
                    KONTOSLANT,
                    KONTO_SLANT,
                    LARRY3D,
                    LARRY_3D,
                    LARRY_3D_2,
                    LCD,
                    LETTERS,
                    LILDEVIL,
                    LIL_DEVIL,
                    LINEBLOCKS,
                    LINE_BLOCKS,
                    LINUX,
                    LOCKERGNOME,
                    MADRID,
                    MARQUEE,
                    MAXFOUR,
                    MERLIN1,
                    MERLIN2,
                    MIKE,
                    MIRROR,
                    MODULAR,
                    MORSE,
                    MORSE2,
                    MOSCOW,
                    MSHEBREW210,
                    MUZZLE,
                    NANCYJ,
                    NANCYJ_FANCY,
                    NANCYJ_IMPROVED,
                    NANCYJ_UNDERLINED,
                    NIPPLES,
                    NSCRIPT,
                    NTGREEK,
                    NT_GREEK,
                    NV_SCRIPT,
                    O8,
                    OCTAL,
                    OGRE,
                    OLDBANNER,
                    OLD_BANNER,
                    OS2,
                    PATORJKS_CHEESE,
                    PATORJK_HEX,
                    PAWP,
                    PEAKS,
                    PEAKSSLANT,
                    PEAKS_SLANT,
                    PEBBLES,
                    PEPPER,
                    POISON,
                    PUFFY,
                    PUZZLE,
                    RAMMSTEIN,
                    RECTANGLES,
                    RED_PHOENIX,
                    RELIEF,
                    RELIEF2,
                    REV,
                    REVERSE,
                    ROMAN,
                    ROT13,
                    ROTATED,
                    ROUNDED,
                    ROWANCAP,
                    ROWAN_CAP,
                    ROZZO,
                    RUNIC,
                    RUNYC,
                    SANTACLARA,
                    SANTA_CLARA,
                    SBLOOD,
                    SERIFCAP,
                    SHIMROD,
                    SHORT,
                    SLANT_RELIEF,
                    SLIDE,
                    SLSCRIPT,
                    SL_SCRIPT,
                    SMALLCAPS,
                    SMALL_CAPS,
                    SMALL_ISOMETRIC1,
                    SMALL_KEYBOARD,
                    SMALL_POISON,
                    SMALL_SCRIPT,
                    SMALL_SHADOW,
                    SMALL_SLANT,
                    SMALL_TENGWAR,
                    SMISOME1,
                    SMKEYBOARD,
                    SMPOISON,
                    SMTENGWAR,
                    SOFT,
                    SPEED,
                    SPLIFF,
                    STACEY,
                    STAMPATE,
                    STAMPATELLO,
                    STARSTRIPS,
                    STARWARS,
                    STAR_STRIPS,
                    STAR_WARS,
                    STELLAR,
                    STICK_LETTERS,
                    STOP,
                    STRAIGHT,
                    STRONGER_THAN_ALL,
                    SUB_ZERO,
                    SWAMPLAND,
                    SWAMP_LAND,
                    SWAN,
                    SWEET,
                    S_BLOOD,
                    S_RELIEF,
                    TANJA,
                    TENGWAR,
                    TEST1,
                    THE_EDGE,
                    THICK,
                    THIN,
                    THIS,
                    THORNED,
                    THREEPOINT,
                    THREE_POINT,
                    TICKS,
                    TICKSSLANT,
                    TICKS_SLANT,
                    TILES,
                    TINKER_TOY,
                    TOMBSTONE,
                    TRAIN,
                    TREK,
                    TSALAGI,
                    TUBULAR,
                    TWISTED,
                    TWOPOINT,
                    TWO_POINT,
                    UNIVERS,
                    USAFLAG,
                    USA_FLAG,
                    VARSITY,
                    WAVY,
                    WEIRD,
                    WETLETTER,
                    WET_LETTER,
                    WHIMSY,
                    WOW
            );
        }
        return NAMES;
    }

}
