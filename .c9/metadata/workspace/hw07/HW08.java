{"changed":true,"filter":false,"title":"HW08.java","tooltip":"/hw07/HW08.java","value":"/////////////////////////////////////////////////////////////////////////////////////\n//Danelia Changeux \n//date goes\n//hw08 \nimport java.util.Scanner;\n// This is a game that will run depending on inputs and choices of the user\n//First compile the program \n    //javac game.java\n//Then run the program \n    //java game\n// define a class\npublic class game{\n    // add the main metyhod required for every program \n    public static void main(String []args){\n char option;\n Scanner scan = new Scanner(System.in); // the follo0wing lines are what will be printed depending on the users inputs \n System.out.println(\"Welcome to MG's adventure world. Now your journey begins.Good Luck!\");\n System.out.println(\"Please hit'C' or 'c' to continue, anything else to quit-\");\n String input= getInput(scan,\"Cc\");\n System.out.println(\"You are in a dead valley.\");\n System.out.println(\"Please hit'C' or 'c' to continue, anything else to quit-\");\n input = getInput(scan,\"Cc\");\n System.out.println(\"You walked and walked and walked and you saw a cave!\");\n cave();\n System.out.println(\"Please hit'C' or 'c' to continue, anything else to quit-\");\n input = getInput(scan,\"Cc\");\n System.out.println(\"You entered a cave!\");\n  System.out.println(\"Please hit'C' or 'c' to continue, anything else to quit-\");\n input = getInput(scan,\"Cc\");\n System.out.println(\"Unfortunately, you ran into a GIANT!\");\n giant();\n System.out.println(\"Enter 'A' or 'a' to attack, 'E' or 'e' to Escape, ANYTHING else is to YEILD\");\n input= getInput(scan,\"AaEe\", 10);\n System.out.println(\"Congragulations! You SURVIVED! Get your REWARD!\");\n System.out.println(\"There are three tressure boxes in front of you! Enter the box number you want to open!\");\n box();\n input= getInput(scan);\n System.out.println(\"Hero! Have a good day!\");\n    \n    }\n    \npublic static void giant() {\n        System.out.println(\"                                 ---------                    \");\n        System.out.println(\"                                |  /    \\\\|                   \");\n        System.out.println(\"                      ZZZZZH    |    O    |    HZZZZZ             \");\n        System.out.println(\"                           H     -----------   H              \");\n        System.out.println(\"                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   \");\n        System.out.println(\"                           H    HHHHHHHHHHH    H                      \");\n        System.out.println(\"                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               \");\n        System.out.println(\"                                HHHHHHHHHHH                   \");\n        System.out.println(\"                                HHH     HHH                   \");\n        System.out.println(\"                               HHH       HHH                   \");\n    }\npublic static void cave() {\n        System.out.println(\"                              *****   * * * * * * * *        \");\n        System.out.println(\"                         ***         ***                      \");\n        System.out.println(\"                      ***               ***                   \");\n        System.out.println(\"                 |    ***               ***                   \");\n        System.out.println(\"                 |    ***               ***                   \");\n        System.out.println(\"             O __|__  ***               ***                   \");\n        System.out.println(\"           ******l    ***               ***                   \");\n        System.out.println(\"            * *       ***               ***                   \");\n        System.out.println(\"           *   *      ********************* * * * * * *       \");\n    }\npublic static void box(){\n       System.out.println(\"                      *********************     *********************    *********************             \");\n        System.out.println(\"                     ***               ***     ***               ***    ***               ***              \");\n        System.out.println(\"                     ***       1       ***     ***       2       ***    ***       3       ***              \");\n        System.out.println(\"                     ***               ***     ***               ***    ***               ***              \");\n        System.out.println(\"                     *********************     *********************    *********************               \"); \n    }\npublic static String getInput(Scanner scan, String string){\n    String input = scan.next();\n    if (input.equals(\"C\")||input.equals(\"c\")){\n        return\"\";\n    \n    }else{\n        System.out.println(\"Yea right you LOSER!\");\n        System.exit(0);\n        return\"\";\n    }\n}\n\npublic static String getInput(Scanner scan, String string, int trial){ // the next few lines will determine whether the user will hit or escape the monster and will make the user input an A,a,E or e until 10 critical hits are made \n    int count = 0;\n    String input  = scan.next();\n    while (input.equals (\"A\")|| input.equals(\"a\")|| input.equals(\"E\")||input.equals(\"e\")){\n        if (input.equals(\"A\")||input.equals(\"a\")){\n        double attack = Math.random();\n            if(attack > 0.5){\n                System.out.println(\"Critical Hit!\"); \n                count++;\n        \n    \n            }else{\n                System.out.println(\"Gosh! How can you miss it?\");\n            }\n        }else{\n          int escape = (int) (Math.random()*10); \n          if(escape == 0){ \n                System.out.println(\"You have escaped!\"); \n                System.exit(0);\n            }else{\n                System.out.println(\"You have not escaped!\");\n            }\n        }\n        \n        if (count==trial){\n            return\"\";\n        }\n        System.out.println(\"Enter 'A' or 'a' to attack, 'E' or 'e' to Escape, ANYTHING else is to YEILD\");\n        input  = scan.next(); //countinues to read input\n            \n     }\n     System.out.println(\"Executed by the Giant!\");\n     System.exit(0);\n     return\"\";\n}\n\n    \n    \n    public static String getInput(Scanner scan){ // thei will prompt the user to chose a box out of three and then give the user a reward according to the box they chose\n        char input = scan.next().charAt(0);// will only give the first character of the string\n        switch(input){\n            case'1':\n            System.out.println(\"GPA 4.00\");\n            return\"\";\n             case'2':\n            System.out.println(\"GPA 3.35\");\n            return\"\";\n             case'3':\n            System.out.println(\"You have made the dean's list!\");\n            return\"\";\n            default:\n            System.out.println(\"Restart the game!\");\n            return\"\";\n        }\n    }\n    \n}\n\n\n","undoManager":{"mark":-414,"position":100,"stack":[[{"group":"doc","deltas":[{"start":{"row":15,"column":49},"end":{"row":15,"column":50},"action":"insert","lines":["l"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":50},"end":{"row":15,"column":51},"action":"insert","lines":["l"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":51},"end":{"row":15,"column":52},"action":"insert","lines":["o"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":52},"end":{"row":15,"column":53},"action":"insert","lines":["0"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":53},"end":{"row":15,"column":54},"action":"insert","lines":["w"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":54},"end":{"row":15,"column":55},"action":"insert","lines":["i"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":55},"end":{"row":15,"column":56},"action":"insert","lines":["n"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":56},"end":{"row":15,"column":57},"action":"insert","lines":["g"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":57},"end":{"row":15,"column":58},"action":"insert","lines":[" "]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":58},"end":{"row":15,"column":59},"action":"insert","lines":["l"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":59},"end":{"row":15,"column":60},"action":"insert","lines":["i"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":60},"end":{"row":15,"column":61},"action":"insert","lines":["v"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":60},"end":{"row":15,"column":61},"action":"remove","lines":["v"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":60},"end":{"row":15,"column":61},"action":"insert","lines":["n"]},{"start":{"row":15,"column":61},"end":{"row":15,"column":62},"action":"insert","lines":["b"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":62},"end":{"row":15,"column":63},"action":"insert","lines":["e"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":63},"end":{"row":15,"column":64},"action":"insert","lines":["s"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":63},"end":{"row":15,"column":64},"action":"remove","lines":["s"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":62},"end":{"row":15,"column":63},"action":"remove","lines":["e"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":61},"end":{"row":15,"column":62},"action":"remove","lines":["b"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":60},"end":{"row":15,"column":61},"action":"remove","lines":["n"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":60},"end":{"row":15,"column":61},"action":"insert","lines":["n"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":61},"end":{"row":15,"column":62},"action":"insert","lines":["e"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":62},"end":{"row":15,"column":63},"action":"insert","lines":["s"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":63},"end":{"row":15,"column":64},"action":"insert","lines":[" "]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":64},"end":{"row":15,"column":65},"action":"insert","lines":["a"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":65},"end":{"row":15,"column":66},"action":"insert","lines":["r"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":66},"end":{"row":15,"column":67},"action":"insert","lines":["e"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":67},"end":{"row":15,"column":68},"action":"insert","lines":[" "]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":68},"end":{"row":15,"column":69},"action":"insert","lines":["w"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":69},"end":{"row":15,"column":70},"action":"insert","lines":["h"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":70},"end":{"row":15,"column":71},"action":"insert","lines":["a"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":71},"end":{"row":15,"column":72},"action":"insert","lines":["t"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":72},"end":{"row":15,"column":73},"action":"insert","lines":[" "]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":73},"end":{"row":15,"column":74},"action":"insert","lines":["w"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":74},"end":{"row":15,"column":75},"action":"insert","lines":["i"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":75},"end":{"row":15,"column":76},"action":"insert","lines":["l"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":76},"end":{"row":15,"column":77},"action":"insert","lines":["l"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":77},"end":{"row":15,"column":78},"action":"insert","lines":[" "]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":78},"end":{"row":15,"column":80},"action":"insert","lines":["[]"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":79},"end":{"row":15,"column":80},"action":"insert","lines":["p"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":79},"end":{"row":15,"column":80},"action":"remove","lines":["p"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":79},"end":{"row":15,"column":80},"action":"insert","lines":["b"]},{"start":{"row":15,"column":80},"end":{"row":15,"column":81},"action":"insert","lines":[" "]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":81},"end":{"row":15,"column":82},"action":"insert","lines":["e"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":82},"end":{"row":15,"column":83},"action":"insert","lines":[" "]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":82},"end":{"row":15,"column":83},"action":"remove","lines":[" "]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":81},"end":{"row":15,"column":82},"action":"remove","lines":["e"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":80},"end":{"row":15,"column":81},"action":"remove","lines":[" "]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":79},"end":{"row":15,"column":80},"action":"remove","lines":["b"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":79},"end":{"row":15,"column":80},"action":"remove","lines":["]"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":78},"end":{"row":15,"column":79},"action":"remove","lines":["["]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":77},"end":{"row":15,"column":78},"action":"remove","lines":[" "]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":77},"end":{"row":15,"column":78},"action":"insert","lines":[" "]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":78},"end":{"row":15,"column":79},"action":"insert","lines":["b"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":79},"end":{"row":15,"column":80},"action":"insert","lines":["e"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":80},"end":{"row":15,"column":81},"action":"insert","lines":[" "]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":81},"end":{"row":15,"column":82},"action":"insert","lines":["p"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":82},"end":{"row":15,"column":83},"action":"insert","lines":["r"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":83},"end":{"row":15,"column":84},"action":"insert","lines":["i"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":84},"end":{"row":15,"column":85},"action":"insert","lines":["n"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":85},"end":{"row":15,"column":86},"action":"insert","lines":["t"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":86},"end":{"row":15,"column":87},"action":"insert","lines":["e"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":87},"end":{"row":15,"column":88},"action":"insert","lines":["d"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":88},"end":{"row":15,"column":89},"action":"insert","lines":[" "]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":89},"end":{"row":15,"column":90},"action":"insert","lines":["d"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":90},"end":{"row":15,"column":91},"action":"insert","lines":["e"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":91},"end":{"row":15,"column":92},"action":"insert","lines":["p"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":92},"end":{"row":15,"column":93},"action":"insert","lines":["e"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":93},"end":{"row":15,"column":94},"action":"insert","lines":["n"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":94},"end":{"row":15,"column":95},"action":"insert","lines":["d"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":95},"end":{"row":15,"column":96},"action":"insert","lines":["i"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":96},"end":{"row":15,"column":97},"action":"insert","lines":["n"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":97},"end":{"row":15,"column":98},"action":"insert","lines":["g"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":98},"end":{"row":15,"column":99},"action":"insert","lines":[" "]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":99},"end":{"row":15,"column":100},"action":"insert","lines":["o"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":100},"end":{"row":15,"column":101},"action":"insert","lines":["n"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":101},"end":{"row":15,"column":102},"action":"insert","lines":[" "]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":102},"end":{"row":15,"column":103},"action":"insert","lines":["t"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":103},"end":{"row":15,"column":104},"action":"insert","lines":["h"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":104},"end":{"row":15,"column":105},"action":"insert","lines":["e"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":105},"end":{"row":15,"column":106},"action":"insert","lines":[" "]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":106},"end":{"row":15,"column":107},"action":"insert","lines":["u"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":107},"end":{"row":15,"column":108},"action":"insert","lines":["s"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":108},"end":{"row":15,"column":109},"action":"insert","lines":["e"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":109},"end":{"row":15,"column":110},"action":"insert","lines":["r"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":110},"end":{"row":15,"column":111},"action":"insert","lines":["s"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":111},"end":{"row":15,"column":112},"action":"insert","lines":["a"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":112},"end":{"row":15,"column":113},"action":"insert","lines":[" "]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":113},"end":{"row":15,"column":114},"action":"insert","lines":["i"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":114},"end":{"row":15,"column":115},"action":"insert","lines":["n"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":114},"end":{"row":15,"column":115},"action":"remove","lines":["n"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":113},"end":{"row":15,"column":114},"action":"remove","lines":["i"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":112},"end":{"row":15,"column":113},"action":"remove","lines":[" "]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":111},"end":{"row":15,"column":112},"action":"remove","lines":["a"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":111},"end":{"row":15,"column":112},"action":"insert","lines":[" "]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":112},"end":{"row":15,"column":113},"action":"insert","lines":["i"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":113},"end":{"row":15,"column":114},"action":"insert","lines":["n"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":114},"end":{"row":15,"column":115},"action":"insert","lines":["p"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":115},"end":{"row":15,"column":116},"action":"insert","lines":["u"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":116},"end":{"row":15,"column":117},"action":"insert","lines":["t"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":117},"end":{"row":15,"column":118},"action":"insert","lines":["s"]}]}],[{"group":"doc","deltas":[{"start":{"row":15,"column":118},"end":{"row":15,"column":119},"action":"insert","lines":[" "]}]}]]},"ace":{"folds":[],"scrolltop":1684,"scrollleft":0,"selection":{"start":{"row":142,"column":0},"end":{"row":142,"column":0},"isBackwards":false},"options":{"guessTabSize":true,"useWrapMode":false,"wrapToView":true},"firstLineState":{"row":119,"state":"start","mode":"ace/mode/java"}},"timestamp":1427242437881}