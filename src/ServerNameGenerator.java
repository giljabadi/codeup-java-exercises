public class ServerNameGenerator {
    String[] adjectives = {"adorable","adventurous","aggressive","agreeable","alert","alive","amused","angry","annoyed","annoying"};
    String[] nouns = {"balloon","van", "iron", "banana", "grass","soccer", "rose", "ice", "beard", "eggplant"};

    String randomWord(String[] words){
        int num = (int)Math.floor(Math.random()*10);
        return words[num];
    }


    public static void main(String[] args) {
        ServerNameGenerator sg = new ServerNameGenerator();
        String name = sg.randomWord(sg.adjectives)+"-"+sg.randomWord(sg.nouns);
        System.out.printf("Here is your server name:\n%s", name);
    }
}