class Post {
    String content;
    Post prev;
    Post next;

    Post(String content) {
        this.content = content;
    }
}

class SocialMediaFeed {
    Post head;
    Post current;

    // Insert post at end
    public void insertPost(String content) {
        Post newPost = new Post(content);

        if (head == null) {
            head = newPost;
            current = head;
            return;
        }

        Post temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newPost;
        newPost.prev = temp;
    }

    // Delete post
    public void deletePost(String content) {
        Post temp = head;

        while (temp != null) {
            if (temp.content.equals(content)) {

                if (temp.prev != null)
                    temp.prev.next = temp.next;
                else
                    head = temp.next;

                if (temp.next != null)
                    temp.next.prev = temp.prev;

                System.out.println("Deleted: " + content);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Post not found.");
    }

    // Insert sponsored ad after a post
    public void insertSponsoredPost(String afterPost, String adContent) {
        Post temp = head;

        while (temp != null) {
            if (temp.content.equals(afterPost)) {

                Post ad = new Post("[SPONSORED] " + adContent);

                ad.next = temp.next;
                ad.prev = temp;

                if (temp.next != null)
                    temp.next.prev = ad;

                temp.next = ad;

                System.out.println("Sponsored post inserted.");
                return;
            }

            temp = temp.next;
        }
    }

    // Next Post
    public void nextPost() {
        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Current: " + current.content);
        } else {
            System.out.println("No next post.");
        }
    }

    // Previous Post
    public void prevPost() {
        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Current: " + current.content);
        } else {
            System.out.println("No previous post.");
        }
    }

    // Display Feed
    public void displayFeed() {
        Post temp = head;

        System.out.println("\nSOCIAL MEDIA FEED");
        while (temp != null) {
            System.out.println(temp.content);
            temp = temp.next;
        }
    }
}

public class MainSocialMediaFeed {
    public static void main(String[] args) {

        SocialMediaFeed feed = new SocialMediaFeed();

        feed.insertPost("Post 1 : Vacation Photo");
        feed.insertPost("Post 2 : Food Reel");
        feed.insertPost("Post 3 : Coding Tutorial");

        feed.insertSponsoredPost(
                "Post 2 : Food Reel",
                "Buy New Smartphone");

        feed.displayFeed();

        System.out.println("\nScrolling Forward");
        feed.nextPost();
        feed.nextPost();

        System.out.println("\nScrolling Backward");
        feed.prevPost();

        feed.deletePost("Post 3 : Coding Tutorial");

        feed.displayFeed();
    }
}