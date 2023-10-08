package study.designpattern.behavioralpattern.iterator.after;

import study.designpattern.behavioralpattern.iterator.before.Post;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AfterIteratorBoard {

    List<Post> posts = new ArrayList<>();

    public List<Post> getPosts() {
        return posts;
    }

    public void addPost(String content) {
        this.posts.add(new Post(content));
    }

    public Iterator<Post> getRecentPostIterator() {
        List<Post> iteratorParam = new ArrayList<>();
        Iterator<Post> iterator = posts.iterator();
        while (iterator.hasNext()) {
            iteratorParam.add(iterator.next());
        }
        return new RecentPostIterator(iteratorParam);
    }


}
