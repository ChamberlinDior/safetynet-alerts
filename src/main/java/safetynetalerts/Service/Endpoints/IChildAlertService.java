package safetynetalerts.Service.Endpoints;

import safetynetalerts.dto.ChildrenAndAdults;

import java.util.List;

public interface IChildAlertService {
    List<ChildrenAndAdults> getChildAlert(String address) throws Exception;
}
