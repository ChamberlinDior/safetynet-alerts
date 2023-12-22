package safetynetalerts.dto;

import lombok.Data;

import java.util.List;

@Data
public class ChildrenAndAdults {
    private List<Child> childList;
    private List<Adult> adultList;

    public ChildrenAndAdults(List<Child> childList, List<Adult> adultList) {
        this.childList = childList;
        this.adultList = adultList;
    }
}
