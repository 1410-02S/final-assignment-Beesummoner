import java.util.Random;
import java.util.ArrayList;

public class Main {

    static Random generator;

    static String[] names = {
            "Darrell", "Giancarlo", "Elisha", "Junior", "Zackery", "Alvaro", "Lewis", "Valentin", "Deacon", "Jase",
            "Harry", "Kendall", "Rashad", "Finnegan", "Mohammed", "Ramiro", "Cedric", "Brennen", "Santino", "Stanley",
            "Tyrone", "Chace", "Francis", "Johnathon", "Teagan", "Zechariah", "Alonso", "Kaeden", "Kamden", "Gilberto",
            "Ray", "Karter", "Luciano", "Nico", "Kole", "Aryan", "Draven", "Jamie", "Misael", "Lee", "Alexzander",
            "Camren", "Giovanny", "Amare", "Rhett", "Rhys", "Rodolfo", "Nash", "Markus", "Deven", "Mohammad", "Moshe",
            "Quintin", "Dwayne", " Memphis", "Atticus", "Davian", "Eugene", "Jax", "Antoine", "Wayne", "Randall",
            "Semaj", "Uriah", "Clark", "Aidyn", "Jorden", "Maxim", "Aditya", "Lawson", "Messiah", "Korbin", "Sullivan",
            "Freddy", "Demarcus", "Neil", "Brice", "King", "Davon", "Elvis", "Ace", "Dexter", "Heath", "Duncan",
            "Jamar", "Sincere", "Irvin", "Remington", "Kadin", "Soren", "Tyree", "Damarion", "Talan", "Adrien",
            "Gilbert", "Keenan", "Darnell", "Adolfo", "Tristian", "Derick", "Isai", "Rylee", "Gauge", "Harold",
            "Kareem", "Deangelo", "Agustin", "Coleman", "Zavier", "Lamar", "Emery", "Jaydin", "Devan", "Jordyn",
            "Mathias", "Prince", "Sage", "Seamus", "Jasiah", "Efrain", "Darryl", "Arjun", "Mike", "Roland", "Conrad",
            "Kamron", "Hamza", "Santos", "Frankie", "Dominique", "Marley", "Vance", "Dax", "Jamir", "Kylan", "Todd",
            "Maximo", "Jabari", "Matthias", "Haiden", "Luka", "Marcelo", "Keon", "Layton", "Tyrell", "Kash", "Raiden",
            "Cullen", "Donte", "Jovani", "Cordell", "Kasen", "Rory", "Alfred", "Darwin", "Ernest", "Bailey", "Gaige",
            "Hassan", "Jamarcus", "Killian", "Augustus", "Trevin", "Zain", "Ellis", "Rex", "Yusuf", "Bruno", "Jaidyn",
            "Justus", "Ronin", "Humberto", "Jaquan", "Josh", "Kasey", "Winston", "Dashawn", "Lucian", "Matias",
            "Sidney", "Ignacio", "Nigel", "Van", "Elian", "Finley", "Jaron", "Addison", "Aedan", "Braedon", "Jadyn",
            "Konner", "Zayne", "Franco", "Niko", "Savion", "Cristofer", "Deon", "Krish", "Anton", "Brogan", "Cael",
            "Coby", "Kymani", "Marcel", "Yair", "Dale", "Bo", "Jordon", "Samir", "Darien", "Zaire", "Ross", "Vaughn",
            "Devyn", "Kenyon", "Clay", "Dario", "Ishaan", "Jair", "Kael", "Adonis", "Jovanny", "Clinton", "Rey",
            "Chaim", "German", "Harper", "Nathen", "Rigoberto", "Sonny", "Glenn", "Octavio", "Blaze", "Keshawn",
            "Ralph", "Ean", "Nikhil", "Rayan", "Sterling", "Branson", "Jadiel", "Dillan", "Jeramiah", "Koen", "Konnor",
            "Antwan", "Houston", "Tyrese", "Dereon", "Leonidas", "Zack", "Fisher", "Jaydan", "Quinten", "Nick",
            "Urijah", "Darion", "Jovan", "Salvatore", "Beckham", "Jarrett", "Antony", "Eden", "Makai", "Zaiden",
            "Broderick", "Camryn", "Malaki", "Nikolai", "Howard", "Immanuel", "Demarion", "Valentino", "Jovanni",
            "Ayaan", "Ethen", "Leandro", "Royce", "Yael", "Yosef", "Jean", "Marquise", "Alden", "Leroy", "Gaven",
            "Jovany", "Tyshawn", "Aarav", "Kadyn", "Milton", "Zaid", "Kelton", "Tripp", "Kamren", "Slade", "Hezekiah",
            "Jakobe", "Nathanial", "Rishi", "Shamar", "Geovanni", "Pranav", "Roderick", "Bentley", "Clarence", "Lyric",
            "Bernard", "Carmelo", "Denzel", "Maximillian", "Reynaldo", "Cassius", "Gordon", "Reuben", "Samson",
            "Yadiel", "Jayvon", "Reilly", "Sheldon", "Abdullah", "Jagger", "Thaddeus", "Case", "Kyson", "Lamont",
            "Chaz", "Makhi", "Jan", "Marques", "Oswaldo", "Donavan", "Keyon", "Kyan", "Simeon", "Trystan", "Andreas",
            "Dangelo", "Landin", "Reagan", "Turner", "Arnav", "Brenton", "Callum", "Jayvion", "Bridger", "Sammy",
            "Deegan", "Jaylan", "Lennon", "Odin", "Abdiel", "Jerimiah", "Eliezer", "Bronson", "Cornelius", "Pierre",
            "Cortez", "Baron", "Carlo", "Carsen", "Fletcher", "Izayah", "Kolten", "Damari", "Hugh", "Jensen", "Yurem",
            "Emma", "Isabella", "Emily", "Madison", "Ava", "Olivia", "Sophia", "Abigail", "Elizabeth", "Chloe",
            "Samantha", "Addison", "Natalie", "Mia", "Alexis", "Alyssa", "Hannah", "Ashley", "Ella", "Sarah", "Grace",
            "Taylor", "Brianna", "Lily", "Hailey", "Anna", "Victoria", "Kayla", "Lillian", "Lauren", "Kaylee",
            "Allison", "Savannah", "Nevaeh", "Gabriella", "Sofia", "Makayla", "Avery", "Riley", "Julia", "Leah",
            "Aubrey", "Jasmine", "Audrey", "Katherine", "Morgan", "Brooklyn", "Destiny", "Sydney", "Alexa", "Kylie",
            "Brooke", "Kaitlyn", "Evelyn", "Layla", "Madeline", "Kimberly", "Zoe", "Jessica", "Peyton", "Alexandra",
            "Claire", "Madelyn", "Maria", "Mackenzie", "Arianna", "Jocelyn", "Amelia", "Angelina", "Trinity", "Andrea",
            "Maya", "Valeria", "Sophie", "Rachel", "Vanessa", "Aaliyah", "Mariah", "Gabrielle", "Katelyn", "Ariana",
            "Bailey", "Camila", "Jennifer", "Melanie", "Gianna", "Charlotte", "Paige", "Autumn", "Payton", "Faith",
            "Sara", "Isabelle", "Caroline", "Genesis", "Isabel", "Mary", "Zoey", "Gracie", "Megan", "Haley", "Mya",
            "Michelle", "Molly", "Stephanie", "Nicole", "Jenna", "Natalia", "Sadie", "Jada", "Serenity", "Lucy", "Ruby",
            "Eva", "Kennedy", "Rylee", "Jayla", "Naomi", "Rebecca", "Lydia", "Daniela", "Bella", "Keira", "Adriana",
            "Lilly", "Hayden", "Miley", "Katie", "Jade", "Jordan", "Gabriela", "Amy", "Angela", "Melissa", "Valerie",
            "Giselle", "Diana", "Amanda", "Kate", "Laila", "Reagan", "Jordyn", "Kylee", "Danielle", "Briana", "Marley",
            "Leslie", "Kendall", "Catherine", "Liliana", "Mckenzie", "Jacqueline", "Ashlyn", "Reese", "Marissa",
            "London", "Juliana", "Shelby", "Cheyenne", "Angel", "Daisy", "Makenzie", "Miranda", "Erin", "Amber",
            "Alana", "Ellie", "Breanna", "Ana", "Mikayla", "Summer", "Piper", "Adrianna", "Jillian", "Sierra", "Jayden",
            "Sienna", "Alicia", "Lila", "Margaret", "Alivia", "Brooklynn", "Karen", "Violet", "Sabrina", "Stella",
            "Aniyah", "Annabelle", "Alexandria", "Kathryn", "Skylar", "Aliyah", "Delilah", "Julianna", "Kelsey",
            "Khloe", "Carly", "Amaya", "Mariana", "Christina", "Alondra", "Tessa", "Eliana", "Bianca", "Jazmin",
            "Clara", "Vivian", "Josephine", "Delaney", "Scarlett", "Elena", "Cadence", "Alexia", "Maggie", "Laura",
            "Nora", "Ariel", "Elise", "Nadia", "Mckenna", "Chelsea", "Lyla", "Alaina", "Jasmin", "Hope", "Leila",
            "Caitlyn", "Cassidy", "Makenna", "Allie", "Izabella", "Eden", "Callie", "Haylee", "Caitlin", "Kendra",
            "Karina", "Kyra", "Kayleigh", "Addyson", "Kiara", "Jazmine", "Karla", "Camryn", "Alina", "Lola", "Kyla",
            "Kelly", "Fatima", "Tiffany", "Kira", "Crystal", "Mallory", "Esmeralda", "Alejandra", "Eleanor", "Angelica",
            "Jayda", "Abby", "Kara", "Veronica", "Carmen", "Jamie", "Ryleigh", "Valentina", "Allyson", "Dakota",
            "Kamryn", "Courtney", "Cecilia", "Madeleine", "Aniya", "Alison", "Esther", "Heaven", "Aubree", "Lindsey",
            "Leilani", "Nina", "Melody", "Macy", "Ashlynn", "Joanna", "Cassandra", "Alayna", "Kaydence", "Madilyn",
            "Aurora", "Heidi", "Emerson", "Kimora", "Madalyn", "Erica", "Josie", "Katelynn", "Guadalupe", "Harper",
            "Ivy", "Lexi", "Camille", "Savanna", "Dulce", "Daniella", "Lucia", "Emely", "Joselyn", "Kiley", "Kailey",
            "Miriam", "Cynthia", "Rihanna", "Georgia", "Rylie", "Harmony", "Kiera", "Kyleigh", "Monica", "Bethany",
            "Kaylie", "Cameron", "Teagan", "Cora", "Brynn", "Ciara", "Genevieve", "Alice", "Maddison", "Eliza",
            "Tatiana", "Jaelyn", "Erika", "Ximena", "April", "Marely", "Julie", "Danica", "Presley", "Brielle",
            "Julissa", "Angie", "Iris", "Brenda", "Hazel", "Rose", "Malia", "Shayla", "Fiona", "Phoebe", "Nayeli",
            "Paola", "Kaelyn", "Selena", "Audrina", "Rebekah", "Carolina", "Janiyah", "Michaela", "Penelope", "Janiya",
            "Anastasia", "Adeline", "Ruth", "Sasha", "Denise", "Holly", "Madisyn", "Hanna", "Tatum", "Marlee", "Nataly",
            "Helen", "Janelle", "Lizbeth", "Serena", "Anya", "Jaslene", "Kaylin", "Jazlyn", "Nancy", "Lindsay",
            "Desiree", "Hayley", "Itzel", "Imani", "Madelynn", "Asia", "Kadence", "Madyson", "Talia", "Jane", "Kayden",
            "Annie", "Amari", "Bridget", "Raegan", "Jadyn", "Celeste", "Jimena", "Luna", "Yasmin", "Emilia", "Annika",
            "Estrella", "Sarai", "Lacey", "Ayla", "Alessandra", "Willow", "Nyla", "Dayana", "Lilah", "Lilliana",
            "Natasha", "Hadley", "Harley", "Priscilla", "Claudia", "Allisson", "Baylee", "Brenna", "Brittany", "Skyler",
            "Fernanda", "Danna", "Melany", "Cali", "Lia", "Macie", "Lyric", "Logan", "Gloria", "Lana", "Mylee", "Cindy",
            "Lilian", "Amira", "Anahi", "Alissa", "Anaya", "Lena", "Ainsley", "Sandra", "Noelle", "Marisol", "Meredith",
            "Kailyn", "Lesly", "Johanna", "Diamond", "Evangeline", "Juliet", "Kathleen", "Meghan", "Paisley", "Athena",
            "Hailee", "Rosa", "Wendy", "Emilee", "Sage", "Alanna", "Elaina", "Cara", "Nia", "Paris", "Casey", "Dana",
            "Emery", "Rowan", "Aubrie", "Kaitlin", "Jaden", "Kenzie", "Kiana", "Viviana", "Norah", "Lauryn", "Perla",
            "Amiyah", "Alyson", "Rachael", "Shannon", "Aileen", "Miracle", "Lillie", "Danika", "Heather", "Kassidy",
            "Taryn", "Tori", "Francesca", "Kristen", "Amya", "Elle", "Kristina", "Cheyanne", "Haylie", "Patricia",
            "Anne", "Samara", "Skye", "Kali", "America", "Lexie", "Parker", "Halle", "Londyn", "Abbigail", "Linda",
            "Hallie", "Saniya", "Bryanna", "Bailee", "Jaylynn", "Mckayla", "Quinn", "Jaelynn", "Jaida", "Caylee",
            "Jaiden", "Melina", "Abril", "Sidney", "Kassandra", "Elisabeth", "Adalyn", "Kaylynn", "Mercedes", "Yesenia",
            "Elliana", "Brylee", "Dylan", "Isabela", "Ryan", "Ashlee", "Daphne", "Kenya", "Marina", "Christine",
            "Mikaela", "Kaitlynn", "Justice", "Saniyah", "Jaliyah", "Ingrid", "Marie", "Natalee", "Joy ", "Juliette",
            "Simone", "Adelaide", "Krystal", "Kennedi", "Mila", "Tamia", "Addisyn", "Aylin", "Dayanara", "Sylvia",
            "Clarissa", "Maritza", "Virginia", "Braelyn", "Jolie", "Jaidyn", "Kinsley", "Kirsten", "Laney", "Marilyn",
            "Whitney", "Janessa", "Raquel", "Anika", "Kamila", "Aria", "Rubi", "Adelyn", "Amara", "Ayanna", "Teresa",
            "Zariah", "Kaleigh", "Amani", "Carla", "Yareli", "Gwendolyn", "Paulina", "Nathalie", "Annabella", "Jaylin",
            "Tabitha", "Deanna", "Madalynn", "Journey", "Aiyana", "Skyla", "Yaretzi", "Ada", "Liana", "Karlee", "Jenny",
            "Myla", "Cristina", "Myah", "Lisa", "Tania", "Isis", "Jayleen", "Jordin", "Arely", "Azul", "Helena",
            "Aryanna", "Jaqueline", "Lucille", "Destinee", "Martha", "Zoie", "Arielle", "Liberty", "Marlene", "Elisa",
            "Isla", "Noemi", "Raven", "Jessie", "Aleah", "Kailee", "Kaliyah", "Lilyana", "Haven", "Tara", "Giana",
            "Camilla", "Maliyah", "Irene", "Carley", "Maeve", "Lea", "Macey", "Sharon", "Alisha", "Marisa", "Jaylene",
            "Kaya", "Scarlet", "Siena", "Adyson", "Maia", "Shiloh", "Tiana", "Jaycee", "Gisselle", "Yazmin", "Eve",
            "Shyanne", "Arabella", "Sherlyn", "Sariah", "Amiya", "Kiersten", "Madilynn", "Shania", "Aleena", "Finley",
            "Kinley", "Kaia", "Aliya", "Taliyah", "Pamela", "Yoselin", "Ellen", "Carlie", "Monserrat", "Jakayla",
            "Reyna", "Yaritza", "Carolyn", "Clare", "Lorelei", "Paula", "Zaria", "Gracelyn", "Kasey", "Regan", "Alena",
            "Angelique", "Regina", "Britney", "Emilie", "Mariam", "Jaylee", "Julianne", "Greta", "Elyse", "Lainey",
            "Kallie", "Felicity", "Zion", "Aspen", "Carlee", "Annalise", "Iliana", "Larissa", "Akira", "Sonia",
            "Catalina", "Phoenix", "Joslyn", "Anabelle", "Mollie", "Susan", "Judith", "Destiney", "Hillary", "Janet",
            "Katrina", "Mareli", "Ansley", "Kaylyn", "Alexus", "Gia", "Maci", "Elsa", "Stacy", "Kaylen", "Carissa",
            "Haleigh", "Lorena", "Jazlynn", "Milagros", "Luz", "Leanna", "Renee", "Shaniya", "Charlie", "Abbie",
            "Cailyn", "Cherish", "Elsie", "Jazmyn", "Elaine", "Emmalee", "Luciana", "Dahlia", "Jamya", "Belinda",
            "Mariyah", "Chaya", "Dayami", "Rhianna", "Yadira", "Aryana", "Rosemary", "Armani", "Cecelia", "Celia",
            "Barbara", "Cristal", "Eileen", "Rayna", "Campbell", "Amina", "Aisha", "Amirah", "Ally", "Araceli",
            "Averie", "Mayra", "Sanaa", "Patience", "Leyla", "Selah", "Zara", "Chanel", "Kiya", "Keyla", "Miah",
            "Aimee", "Giovanna", "Amelie", "Kelsie", "Alisson", "Angeline", "Dominique", "Adrienne", "Brisa", "Cierra",
            "Paloma", "Isabell", "Precious", "Alma", "Charity", "Jacquelyn", "Janae", "Frances", "Shyla", "Janiah",
            "Kierra", "Karlie", "Annabel", "Jacey", "Karissa", "Jaylah", "Xiomara", "Edith", "Marianna", "Damaris",
            "Deborah", "Jaylyn", "Evelin", "Mara", "Olive", "Ayana", "India", "Kendal", "Kayley", "Tamara", "Briley",
            "Charlee", "Nylah", "Abbey", "Moriah", "Saige", "Savanah", "Giada", "Hana", "Lizeth", "Matilda", "Ann",
            "Jazlene", "Gillian", "Beatrice", "Ireland", "Karly", "Mylie", "Yasmine", "Ashly", "Kenna", "Maleah",
            "Corinne", "Keely", "Tanya", "Tianna", "Adalynn", "Ryann", "Salma", "Areli", "Karma", "Shyann", "Kaley",
            "Theresa", "Evie", "Gina", "Roselyn", "Kaila", "Jaylen", "Natalya", "Meadow", "Rayne", "Aliza", "Yuliana",
            "June", "Lilianna", "Nathaly", "Ali", "Alisa", "Aracely", "Belen", "Tess", "Jocelynn", "Litzy", "Makena",
            "Abagail", "Giuliana", "Joyce", "Libby", "Lillianna", "Thalia", "Tia", "Sarahi", "Zaniyah", "Kristin",
            "Lorelai", "Mattie", "Taniya", "Jaslyn", "Gemma", "Valery", "Lailah", "Mckinley", "Micah", "Deja", "Frida",
            "Brynlee", "Jewel", "Krista", "Mira", "Yamilet", "Adison", "Carina", "Karli", "Magdalena", "Stephany",
            "Charlize", "Raelynn", "Aliana", "Cassie", "Mina", "Karley", "Shirley", "Marlie", "Alani", "Taniyah",
            "Cloe", "Sanai", "Lina", "Nola", "Anabella", "Dalia", "Raina", "Mariela", "Ariella", "Bria", "Kamari",
            "Monique", "Ashleigh", "Reina", "Alia", "Ashanti", "Lara", "Lilia", "Justine", "Leia", "Maribel",
            "Abigayle", "Tiara", "Alannah", "Princess", "Sydnee", "Kamora", "Paityn", "Payten", "Naima", "Gretchen",
            "Heidy", "Nyasia", "Livia", "Marin", "Shaylee", "Maryjane", "Laci", "Nathalia", "Azaria", "Anabel",
            "Chasity", "Emmy", "Izabelle", "Denisse", "Emelia", "Mireya", "Shea", "Amiah", "Dixie", "Maren", "Averi"
    };

    static String[] baseServices = {
            "food",
            "water",
            "fuel",
            "data centre",
            "passes"
    };

    static String[] climateList = {
            "Tropical",
            "Dry",
            "Temperate",
            "Continental",
            "Polar"
    };
    static int[][] ennegramCombos = {
            { 1, 4, 7 },
            { 1, 7, 4 },
            { 2, 4, 8 },
            { 2, 8, 4 },
            { 3, 6, 9 },
            { 4, 1, 2 },
            { 4, 2, 1 },
            { 5, 7, 8 },
            { 5, 8, 7 },
            { 6, 9, 3 },
            { 6, 3, 9 },
            { 7, 1, 5 },
            { 7, 5, 1 },
            { 8, 2, 5 },
            { 8, 5, 2 },
            { 9, 3, 6 },
            { 9, 6, 3 }

    };

    static int[][] ennegramCompat = {
            { 1, 2, 9 },
            { 2, 4, 8 },
            { 3, 1, 9 },
            { 4, 2, 9 },
            { 5, 1 },
            { 6, 8, 9, 2 },
            { 7, 5, 1 },
            { 8, 2, 9 },
            { 9, 4, 6 }

    };

    static int[][] ennegramNonCompat = {

            { 7 },
            {},
            {},
            { 8 },
            { 9 },
            {},
            {},
            { 4 },
            { 5 }
    };

    static <T> T pickRandom(T[] array) {
        int rnd = generator.nextInt(array.length);
        return array[rnd];
    }

    
    static class Place {
        public String climate;
        public int est = 0;
        public String name = "example";
        public int value = 0;

        int startingNumber = 0;
        ArrayList<NPC> residents;
        ArrayList<String> services;
        String[] neighbours;

        NPC[] popularPeople;
        NPC[] unpopularPeople;

        public Place(String inputName, int inputStartingNumber) {
            name = inputName;
            startingNumber = inputStartingNumber;
            // getServices(); (throwing error that I haven't been able to fix in an hour
            // will probably try again tomorrow for fun, but I shouldnt spend to much time
            // on it right now for grade purposes.)
            getClimate();

            residents = addRandomCharacter(startingNumber);

            // TODO
        }

        public Place(String inputName) {
            name = inputName;
            startingNumber = generator.nextInt(100);
            // getServices();
            getClimate();

            residents = addRandomCharacter(startingNumber);

            // TODO
        }

        public Place() {
            name = (generator.nextFloat() < .5) ? pickRandom(names) + "ton" : pickRandom(names) + "vile";
            startingNumber = generator.nextInt(100);
            // getServices();
            getClimate();

            residents = addRandomCharacter(startingNumber);

            // TODO
        }

        public int increaseAge() {
            return ++est;
        }

        public ArrayList<NPC> addRandomCharacter(int inputStartingNumber) {

            ArrayList<NPC> temp = new ArrayList<NPC>();
            for (int i = 0; i < inputStartingNumber; i++) {
                temp.add(new NPC());
            }

            // TODO
            return temp;
        }

        public void getClimate() {
            climate = pickRandom(climateList);
        }

        public void getServices() {

            if (services.isEmpty()) {
                int rnd = generator.nextInt(10);

                value = rnd * 1000;
                for (int i = 0; i < rnd; i++) {
                    services.add(pickRandom(baseServices));

                }
            }
        }
    }

    static class NPC {
        String name = "examplePerson";
        int age = 0;
        String[] memories;
        String[] thoughts;

        NPC[] friends;
        NPC[] enemies;
        String[] knowledge;

        int[] ennegram = { 1, 4, 7 };
        String home = "This Base";

        String[] travels = { "This Base" };

        String icon = "";
        int happiness = 100;
        int boredom = 50;

        public NPC() {
            name = pickRandom(names);
            ennegram = pickRandom(ennegramCombos);
            age = generator.nextInt(90) + 10;
            // TODO
        }

        public void intereact() {
            // TODO
            // Reimplement arrrays as arraylists for easier modification.
            // Implement thoughts as some sort of queue
        }

        public void cleanup() {
            // TODO
        }
    }

    static class Weather {
        String weatherName;
        String tempClimate = "Tropical";
        int forcast = generator.nextInt(10);

        public String getWeather(){
            //TODO
            //fix why it is printing out null values :(

            if (tempClimate == "Tropical") {
                switch (forcast) {
                    case 1:
                        weatherName = "rain";
                        break;
                    case 2:
                        weatherName = "rain";
                        break;

                    case 3:
                        weatherName = "rain";
                        break;
                    case 4:
                        weatherName = "rain";
                        break;
                    case 5:
                        weatherName = "thunderstorm";
                        break;
                    case 6:
                        weatherName = "thunderstorm";
                        break;
                    case 7:
                        weatherName = "sunny";
                        break;
                    case 8:
                        weatherName = "sunny";
                        break;
                    case 9:
                        weatherName = "sunny";
                        break;
                    case 10:
                        weatherName = "windy";
                        break;
                }
                            
            }
            if (tempClimate == "Dry") {
                switch (forcast) {
                    case 1:
                        weatherName = "sunny";
                        break;
                    case 2:
                        weatherName = "sunny";
                        break;

                    case 3:
                        weatherName = "sunny";
                        break;
                    case 4:
                        weatherName = "sunny";
                        break;
                    case 5:
                        weatherName = "sunny";
                        break;
                    case 6:
                        weatherName = "windy";
                        break;
                    case 7:
                        weatherName = "windy";
                        break;
                    case 8:
                        weatherName = "windy";
                        break;
                    case 9:
                        weatherName = "sunny";
                        break;
                    case 10:
                        weatherName = "rainy";
                        break;
                }
                
            }
            if (tempClimate == "Temperate") {
                switch (forcast) {
                    case 1:
                        weatherName = "rain";
                        break;
                    case 2:
                        weatherName = "rain";
                        break;

                    case 3:
                        weatherName = "rain";
                        break;
                    case 4:
                        weatherName = "sunny";
                        break;
                    case 5:
                        weatherName = "sunny";
                        break;
                    case 6:
                        weatherName = "thunderstorm";
                        break;
                    case 7:
                        weatherName = "sunny";
                        break;
                    case 8:
                        weatherName = "windy";
                        break;
                    case 9:
                        weatherName = "snow";
                        break;
                    case 10:
                        weatherName = "snow";
                        break;
                }
                
            }
            if (tempClimate == "Continental") {
                switch (forcast) {
                    case 1:
                        weatherName = "rain";
                        break;
                    case 2:
                        weatherName = "snow";
                        break;

                    case 3:
                        weatherName = "snow";
                        break;
                    case 4:
                        weatherName = "snow";
                        break;
                    case 5:
                        weatherName = "blizzard";
                        break;
                    case 6:
                        weatherName = "thunderstorm";
                        break;
                    case 7:
                        weatherName = "snow";
                        break;
                    case 8:
                        weatherName = "snow";
                        break;
                    case 9:
                        weatherName = "sunny";
                        break;
                    case 10:
                        weatherName = "windy";
                        break;
                }
                
            }
            if (tempClimate == "Polar") {
                switch (forcast) {
                    case 1:
                        weatherName = "snow";
                        break;
                    case 2:
                        weatherName = "snow";
                        break;

                    case 3:
                        weatherName = "snow";
                        break;
                    case 4:
                        weatherName = "snow";
                        break;
                    case 5:
                        weatherName = "snow";
                        break;
                    case 6:
                        weatherName = "blizzard";
                        break;
                    case 7:
                        weatherName = "blizzard";
                        break;
                    case 8:
                        weatherName = "sunny";
                        break;
                    case 9:
                        weatherName = "snow";
                        break;
                    case 10:
                        weatherName = "windy";
                        break;
                }
                
            }
            return weatherName;
        }
    }

    public static void main(String[] args) throws Exception {
        generator = new Random();

        Place p = new Place();
        Weather w = new Weather();

        System.out.println(">>>>>>>>>>>>>>>>>>>>>" + p.name + " " + p.startingNumber);
        System.out.println(w.weatherName);

        for (NPC n : p.residents) {
            System.out.println(n.name + " " + n.ennegram[0]);
        }

    }
}
