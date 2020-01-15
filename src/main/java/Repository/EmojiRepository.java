package Repository;

import Model.Emoji;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface EmojiRepository extends CrudRepository<Emoji, Long> {
}
