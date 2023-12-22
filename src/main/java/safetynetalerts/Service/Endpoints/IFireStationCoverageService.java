package safetynetalerts.Service.Endpoints;

import com.safetynet.safetynetalerts.dto.FireCoverage;

import java.text.ParseException;
import java.util.List;

public interface IFireStationCoverageService {
    List<FireCoverage> getFireStationCoverage(String station) throws ParseException;
}
