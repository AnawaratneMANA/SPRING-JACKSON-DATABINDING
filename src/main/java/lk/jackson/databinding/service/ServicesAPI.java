package lk.jackson.databinding.service;

import lk.jackson.databinding.model.GetObject;

import java.util.List;

public interface ServicesAPI {
    List<GetObject> getMethod() throws Exception;
}
