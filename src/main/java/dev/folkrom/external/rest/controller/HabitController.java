package dev.folkrom.external.rest.controller;

import dev.folkrom.application.service.HabitService;
import dev.folkrom.external.rest.dto.HabitPersistanceDto;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Tag(name = "Habit")
@Path("habit")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class HabitController {
    private final HabitService habitService;

    @Inject
    public HabitController(HabitService habitService) {
        this.habitService = habitService;
    }

    @POST
    @Path("save")
    @Operation(operationId = "saveHabit", summary = "Creates a new habit")
    @APIResponse(responseCode = "201", description = "Habit successfully created", content = @Content(schema = @Schema(implementation = Boolean.class)))
    public Response save(HabitPersistanceDto habitDto) {
        return Response.ok(habitService.create(habitDto.toEntity())).status(Response.Status.CREATED).build();
    }

}
