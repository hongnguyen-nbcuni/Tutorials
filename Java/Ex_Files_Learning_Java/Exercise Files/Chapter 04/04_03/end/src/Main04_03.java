
public class Main04_03 {
    public static void main(String[] args) {
    	
        Insect insect = new Insect(5, 6);
        Spider spider = new Spider(13, true); // public class Spider extends Insect
        Cricket cricket = new Cricket(2, 1.25); // class Cricket extends Insect

        insect.crawl();
        insect.says();

        spider.crawl();
        spider.says();

        cricket.crawl();
        cricket.says();
        cricket.jump();

        if (spider instanceof Insect && spider instanceof Spider) {
            System.out.println("Spider is an insect and a spider");
        }

    }

}
