package kalog.com.vn.polls.repository;

import kalog.com.vn.polls.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);

    Optional<User> findByUsernameOrEmail(String username, String email);

    List<User> findByIdIn(List<Long> userIds);

    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);

    @Query("SELECT COUNT(u.id) from User u where u.id = :userId")
    long countByUserId(@Param("userId") Long userId);

    /**
     *     @Query("SELECT NEW com.example.polls.model.ChoiceVoteCount(v.choice.id, count(v.id)) FROM Vote v WHERE v.poll.id in :pollIds GROUP BY v.choice.id")
    List<ChoiceVoteCount> countByPollIdInGroupByChoiceId(@Param("pollIds") List<Long> pollIds);

     @Query("SELECT NEW com.example.polls.model.ChoiceVoteCount(v.choice.id, count(v.id)) FROM Vote v WHERE v.poll.id = :pollId GROUP BY v.choice.id")
     List<ChoiceVoteCount> countByPollIdGroupByChoiceId(@Param("pollId") Long pollId);

     @Query("SELECT v FROM Vote v where v.user.id = :userId and v.poll.id in :pollIds")
     List<Vote> findByUserIdAndPollIdIn(@Param("userId") Long userId, @Param("pollIds") List<Long> pollIds);

     @Query("SELECT v FROM Vote v where v.user.id = :userId and v.poll.id = :pollId")
     Vote findByUserIdAndPollId(@Param("userId") Long userId, @Param("pollId") Long pollId);

     @Query("SELECT COUNT(v.id) from Vote v where v.user.id = :userId")
     long countByUserId(@Param("userId") Long userId);

     @Query("SELECT v.poll.id FROM Vote v WHERE v.user.id = :userId")
     Page<Long> findVotedPollIdsByUserId(@Param("userId") Long userId, Pageable pageable);
     */
}