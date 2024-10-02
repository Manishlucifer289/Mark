package com.mark.mark.Service.impl;

import com.mark.mark.Entity.Post;
import com.mark.mark.Payload.Postdto;
import com.mark.mark.Repository.PostRepository;
import com.mark.mark.Service.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepository postRepository;
    @Autowired
    private ModelMapper modelMapper;


    @Override
    public Postdto createpost(Postdto postdto) {
       Post post=  maptoEntity(postdto);
       postRepository.save(post);
        return null;
    }
}
