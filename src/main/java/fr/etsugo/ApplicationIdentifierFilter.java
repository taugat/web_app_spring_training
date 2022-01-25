package fr.etsugo;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;

@Component
public class ApplicationIdentifierFilter implements Filter
{

    private final String identitfier;

    public ApplicationIdentifierFilter() {

        UUID uuid = UUID.randomUUID();
        this.identitfier = uuid.toString();
    }

    @Override
    public void doFilter(
        ServletRequest servletRequest,
        ServletResponse servletResponse,
        FilterChain filterChain
    ) throws IOException, ServletException
    {

        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;

        httpServletResponse.setHeader("Instance-Id", identitfier);

        filterChain.doFilter(servletRequest, servletResponse);
    }
}
