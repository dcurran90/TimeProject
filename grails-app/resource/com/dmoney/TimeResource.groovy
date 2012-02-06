package com.dmoney

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Consumes
import javax.ws.rs.Produces
import javax.ws.rs.PathParam
import javax.ws.rs.core.Response;



import javax.ws.rs.QueryParam
import javax.ws.rs.HeaderParam


import static org.grails.jaxrs.response.Responses.*





@Consumes(['application/xml', 'application/json'])
@Produces(['application/xml', 'application/json'])
@Path('/api')

class TimeResource
{
    def TimeConverterService
    
    @GET
    @Path('/time/{zone}')
    Response get( @PathParam('zone') String zone) 
    {
        ok TimeConverterService.getTime(zone)
    }
}
