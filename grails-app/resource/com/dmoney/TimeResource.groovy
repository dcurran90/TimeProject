package com.dmoney

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Consumes
import javax.ws.rs.Produces
import javax.ws.rs.PathParam


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
        TimeConverterService.getTime(zone)
    }
    
}
