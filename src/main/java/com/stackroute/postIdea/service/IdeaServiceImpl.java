package com.stackroute.postIdea.service;

import com.stackroute.postIdea.domain.Idea;
import com.stackroute.postIdea.repository.IdeaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class IdeaServiceImpl implements IdeaService {
  IdeaRepository ideaRepository;
  Idea ideaObject;
//
//    @Override
//    public Idea updateIdea(Idea idea, String ideaId) {
//        return ideaRepository.findOne(ideaId);
//    }

    @Autowired
  public IdeaServiceImpl(IdeaRepository ideaRepository)
  {
    this.ideaRepository=ideaRepository;
  }
  @Override
  public Idea addIdea(Idea idea)
  {
    Idea savedIdea;
    savedIdea = ideaRepository.save(idea);
    return savedIdea;
//    if(ideaRepository.existsById(idea.getIdeaId(idea))){
//      throw new IdeaAlreadyExistException("Idea already exist");
//    }
//
//    else{
//    savedIdea = ideaRepository.save(idea);
//      if(savedIdea == null){
//        throw new IdeaNull("Enter Idea");
//      }
//  }


  }

  @Override
  public void deleteIdea(String ideaId) {
    ideaRepository.deleteById(ideaId);

  }

  @Override
  public Idea updateIdea(Idea idea) {
        Idea ideaNew=new Idea();
      if (ideaRepository.existsById(idea.getIdeaId()))
//      if (Objects.isNull(idea)) {
//          /* handle this exception using {@link RestExceptionHandler} */
//          throw new EntityNotFoundException(Idea.class, ideaId);
//      }
      {
          idea.setTitle(ideaObject.getTitle());
          idea.setDescription(ideaObject.getDescription());
          idea.setBudget(ideaObject.getBudget());
          idea.setDomain(ideaObject.getDomain());
          idea.setSubDomain(ideaObject.getSubDomain());
          idea.setRoles(ideaObject.getRoles());
          ideaNew= ideaRepository.save(idea);
      }
      return ideaNew;
  }

  @Override
  public List<Idea> displayIdea() {
    return ideaRepository.findAll();
  }
}
