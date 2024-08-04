package classes;

import java.util.ArrayList;
import java.util.List;

public class LeaveManagement {
    private List<LeaveRequest> leaveRequests;

    public LeaveManagement() {
        leaveRequests = new ArrayList<>();
    }

    public void addLeaveRequest(LeaveRequest leaveRequest) {
        leaveRequests.add(leaveRequest);
    }

    public boolean removeLeaveRequest(int requestId) {
        for (LeaveRequest request : leaveRequests) {
            if (request.getId() == requestId) {
                leaveRequests.remove(request);
                return true;
            }
        }
        return false;
    }

    public LeaveRequest getLeaveRequest(int requestId) {
        for (LeaveRequest request : leaveRequests) {
            if (request.getId() == requestId) {
                return request;
            }
        }
        return null;
    }

    public List<LeaveRequest> getAllLeaveRequests() {
        return new ArrayList<>(leaveRequests);
    }

    public void updateLeaveStatus(int requestId, LeaveStatus status) {
        LeaveRequest request = getLeaveRequest(requestId);
        if (request != null) {
            request.setLeaveStatus(status);
        }
    }

    public void approveLeaveRequest(int requestId) {
        updateLeaveStatus(requestId, LeaveStatus.Accepted);
    }

    public void rejectLeaveRequest(int requestId) {
        updateLeaveStatus(requestId, LeaveStatus.Rejected);
    }
}
