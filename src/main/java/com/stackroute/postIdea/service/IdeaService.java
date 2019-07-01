package com.stackroute.postIdea.service;

import com.stackroute.postIdea.domain.Idea;

import java.util.List;

public interface IdeaService {
Idea addIdea(Idea idea);
void deleteIdea(String ideaId);
Idea updateIdea(Idea idea);
List<Idea> displayIdea();
}
