package site.metacoding.miniproject1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.miniproject1.domain.likes.Likes;
import site.metacoding.miniproject1.domain.likes.LikesDao;
import site.metacoding.miniproject1.web.dto.request.likes.LikesRespListDto;

@RequiredArgsConstructor
@Service
public class LikesService {
    private final LikesDao likesDao;

    public List<LikesRespListDto> 좋아요목록(Integer id) {
        List<LikesRespListDto> likesList = likesDao.findlikes(id);
        return likesList;
    }

    public Likes 좋아요하기(Integer id, Integer userId) {
        Likes like = new Likes(userId,id);
//        System.out.println("==========================");
//        System.out.println(id);
//        System.out.println(userId);
//        System.out.println("==========================");
//        likesDao.insert(like);

        return like;
    }

}
