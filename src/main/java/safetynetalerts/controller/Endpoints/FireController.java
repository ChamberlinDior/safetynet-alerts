package safetynetalerts.controller.Endpoints;

import com.safetynet.safetynetalerts.Service.Endpoints.FireService;
import com.safetynet.safetynetalerts.dto.PhoneAndMedicalWithStation;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Controller mapping GET for FireService and Fire endpoint
 */
@Data
@RestController
public class FireController {

    @Autowired
    FireService service;

    @GetMapping("/fire")
    public List<PhoneAndMedicalWithStation> getFire(@RequestParam String address) {
        return service.getFire(address);
    }
}
